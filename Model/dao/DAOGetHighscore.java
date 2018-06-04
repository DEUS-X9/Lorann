package model.dao;

import java.sql.*;
import java.util.ArrayList;


/**
 * 
 * @author Gauthier Parvillers
 * @version 1.7
 */
public class DAOGetHighscore extends DAOEntityScore<GetHighscore> {

    /**
     * Instantiates a new DAO Get HighScore.
     *
     * @param connection
     *          the connection
     * @throws SQLException
     *           the SQL exception
     */
    public DAOGetHighscore(final Connection connection) throws SQLException {
        super(connection);
    }


    /**
     *
     *
     * @see model.DAOEntityScore#upNameAndScore(int, String)
     */
    public void upNameAndScore(final int score, final String nickname)
    {

    }

    /**
     *
     *
     * @see model.DAOEntityScore#getHighScore()
     */
    public String[][] getHighScore() {
        String[][] stringHighScore = {{},{}};

        try {
            ArrayList<String> aScores = new ArrayList<String>();
            ArrayList<String> aNicknames = new ArrayList<String>();
            String sql = "{call ShowNicknamesScores()}";
            CallableStatement call = this.getConnection().prepareCall(sql);
            ResultSet rs = call.executeQuery(sql);
            while (rs.next()) {
                aScores.add(rs.getString("score"));
                aNicknames.add(rs.getString("nickname"));
            }
            stringHighScore[0] = new String[aNicknames.size()];
            stringHighScore[1] = new String[aScores.size()];
            stringHighScore[0] = aNicknames.toArray(stringHighScore[0]);
            stringHighScore[1] = aScores.toArray(stringHighScore[1]);
            return stringHighScore;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
