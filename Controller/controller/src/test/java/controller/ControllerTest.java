package controller;

import contract.*;
import model.Model;
import view.View;
import org.junit.Before;
import org.junit.Test;

import java.awt.Point;

import static org.junit.Assert.*;

public class ControllerTest {
    private IModel model;
    private IView view;
    private IController controller;
    private IElement[][] expectedMap;

    /**
     * Sets the up.
     *
     * @throws Exception
     *           the exception
     */
    @Before
    public void setUp() throws Exception {
        this.model = new Model();
        this.view = new View(this.model);
        this.controller = new Controller(this.view, this.model);
        this.view.setController(controller);

        this.expectedMap = new IElement[][]{
                {model.element('B', new Point()), model.element('V', new Point()), model.element('H', new Point()), model.element('P', new Point()), model.element('L', new Point())},
                {model.element('1', new Point()), model.element('2', new Point()), model.element('3', new Point()), model.element('4', new Point()), model.element(' ', new Point())},
                {model.element('C', new Point()), model.element('O', new Point()), model.element(' ', new Point()), model.element(' ', new Point()), model.element(' ', new Point())}
        };
    }

    @Test
    public void TestOrderPerformMAP1() throws Exception {
        this.controller.orderPerform(ControllerOrder.MAP1);
        assertEquals(1, this.controller.getLevel());
        assertEquals("BHHHHHHHHHHHHHHHHHHB\n" +
                "V    V             V\n" +
                "V    V             V\n" +
                "V    V     P       V\n" +
                "V  P BHHHHHB       V\n" +
                "V P P1     K  L   CV\n" +
                "V  P BHHHHHB       V\n" +
                "V    V     P       V\n" +
                "V    V             V\n" +
                "V    V             V\n" +
                "V    V             V\n" +
                "BHHHHHHHHHHHHHHHHHHB",
                this.model.getMap());
    }

    @Test
    public void TestOrderPerformMAP2() throws Exception {
        this.controller.orderPerform(ControllerOrder.MAP2);
        assertEquals(2, this.controller.getLevel());
        assertEquals("  BBHHHHHHHHHHHHHHHB\n" +
                        " BB                V\n" +
                        "BB               L V\n" +
                        "B C BHHHHHHHB B BHHB\n" +
                        "V   V    2    V    V\n" +
                        "V   V BHHHHHHHBHHB V\n" +
                        "V   V    4    V    V\n" +
                        "V   BHHHHHHHB V BHHB\n" +
                        "V   V    3    V    V\n" +
                        "B   V BHHHHHHBBHHB V\n" +
                        "VK  V    1   V     V\n" +
                        "BHHHBHHHHHHHHBHHHHHB",
                this.model.getMap());
    }

    @Test
    public void TestOrderPerformMAP3() throws Exception {
        this.controller.orderPerform(ControllerOrder.MAP3);
        assertEquals(3, this.controller.getLevel());
        assertEquals("BHHHHHBHHHHHHHHBHHB \n" +
                        "V     B       BB  VB\n" +
                        "V L   BB     BB   VB\n" +
                        "V      BB  1 B    VB\n" +
                        "V   BB  BB  BB    VB\n" +
                        "V BBB      BB     VB\n" +
                        "BBB   2  K  3  BB VB\n" +
                        "V      B        BBVB\n" +
                        "V    BBB  4  BB  BBB\n" +
                        "V   BB        BB   B\n" +
                        "BHHHBHHHHHHHHHHBB CB\n" +
                        " BBBBBBBBBBBBBBBBBBB",
                this.model.getMap());
    }

    @Test
    public void TestOrderPerformMAP4() throws Exception {
        this.controller.orderPerform(ControllerOrder.MAP4);
        assertEquals(4, this.controller.getLevel());
        assertEquals("  BHHBHHHHHHHHHHHB  \n" +
                        " BB  B           BB \n" +
                        "BB     B BPBPB B  BB\n" +
                        "V  BBB BHBHBHBHBB  V\n" +
                        "V  BVV         V   V\n" +
                        "V   VBHB BHHHB VB  V\n" +
                        "V  BVV   BHB   V   V\n" +
                        "V   BBL  BHB  CVB  V\n" +
                        "V  BHHH BHHHHHHBB  V\n" +
                        "BB  B B B B B BB3KBB\n" +
                        " BB      4  1  2 BB \n" +
                        "  BHHHHHHHHHHHHHHB  ",
                this.model.getMap());
    }

    @Test
    public void TestOrderPerformMAP5() throws Exception {
        this.controller.orderPerform(ControllerOrder.MAP5);
        assertEquals(5, this.controller.getLevel());
        assertEquals(" BHHHHHBB           \n" +
                        "B      KBHHB        \n" +
                        "V BHHHB   PBHHB     \n" +
                        "V1       B   PBHHB  \n" +
                        "V BHHB B   B    PBHB\n" +
                        "V2       B V   L  PV\n" +
                        "V BHHB B   B    PBHB\n" +
                        "V3       B   PBHHB  \n" +
                        "V BHHHB   PBHHB     \n" +
                        "BC      BHHB        \n" +
                        " BHHHHHBB           ",
                this.model.getMap());
    }

 

    @Test
    public void TestOrderPerformMENU() throws Exception {
        this.controller.orderPerform(ControllerOrder.MENU);
        assertEquals(0, this.controller.getLevel());
        assertEquals("BHHHHHHHHHHHHHHHHHHB\n" +
                        "V         L        V\n" +
                        "V  BHBHHHHHHHHBHB  V\n" +
                        "V    V  T     V    V\n" +
                        "BHHB V        V BHHB\n" +
                        "O  B VS       V B  O\n" +
                        "BB   VS       V   BB\n" +
                        "BBHHHBS       BHHHBB\n" +
                        "V    VS       V    V\n" +
                        "BHHHHBHHHHHHHHBHHHHB\n" +
                        "V         1        V\n" +
                        "BHHHHHHHHHHHHHHHHHHB",
                this.model.getMap());
    }

    @Test
    public void TestParser() throws Exception {
        IElement[][] map = this.controller.parser("BVHPL\n" +
                "1234 \n" +
                "CO   ");

        assertEquals(this.expectedMap.length, map.length);
        for (int i = 0; i < map.length; i++){
            assertEquals(this.expectedMap[i].length, map[i].length);
            for (int j = 0; j < map[i].length; j++){
                assertEquals(this.expectedMap[i][j].getClass().getCanonicalName(),
                        map[i][j].getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void TestParserLoadMap() throws Exception {
        this.model.loadMap("TEST");
        IElement[][] map = this.controller.parser(
                this.model.getMap()
        );

        assertEquals(this.expectedMap.length, map.length);
        for (int i = 0; i < map.length; i++){
            assertEquals(this.expectedMap[i].length, map[i].length);
            for (int j = 0; j < map[i].length; j++){
                assertEquals(this.expectedMap[i][j].getClass().getCanonicalName(),
                        map[i][j].getClass().getCanonicalName());
            }
        }
    }
}
