package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import contract.IElement;

class ViewPanel extends JPanel {
	
	private ViewFrame viewFrame;
	
    private IElement[][] tileMap;

	
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
	}


	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}


	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}


    public void update(IElement[][] tileMap) {
        this.tileMap = tileMap;
		this.setSize(this.tileMap[0].length, this.tileMap.length);
		this.repaint();
	}
    
	
	protected void paintComponent(final Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
		graphics.setColor(Color.yellow);
		graphics.setFont(new Font(null, Font.BOLD, 20));

        int scoreIndex = 0;

        String[][] scores = null;

        if(this.tileMap != null)
        {
            for (int i = 0; i < this.tileMap.length; i++)
            {
                for(int j = 0; j < this.tileMap[0].length; j++)
                {
                    BufferedImage image = tileMap[i][j].getImage();
                    if(image != null)
                        graphics.drawImage(image, j*32, i*32, null);
                    else if(tileMap[i][j].getClass().getSimpleName().contains("Title")) {
                        graphics.drawString("HIGHSCORE", j*32, i*32 + 20);
                    } else if(tileMap[i][j].getClass().getSimpleName().contains("Score")) {
						if (scores == null)
							scores = this.viewFrame.getController().getScores();

                        if(scoreIndex < scores[0].length) {
                            graphics.drawString(
                                    String.format("%s %s",
                                            scores[0][scoreIndex],
                                            scores[1][scoreIndex]), j*32 + 5, i*32 + 20);
                            scoreIndex++;
                        }
                    }
                }
            }
        }
		graphics.drawString(String.format("SCORE : %d    LEVEL : %d",
                this.viewFrame.getController().getScore(),
                this.viewFrame.getController().getLevel()), 10, this.getHeight() - 20);
    }
}
