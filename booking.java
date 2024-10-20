
/**
 * Write a description of class project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class booking11 extends JFrame implements ActionListener
{
    JTextField seat, totalcost, name;
    Choice type, block, time; // Choices for the GUI
    JLabel typelbl, blocklbl, timelbl, lblbl, mblbl, rblbl, inputseatlbl, totallbl, title, nmlbl;
    JButton submitbut, showbut, paybut;
    String selectedtime, total, selectedseat, selectedblock, tickettype,getname;
    int timechoice, convertedseat1, convertedseat2, totalprice, typechoice;
    int totaltickets = 0, currenti;

    Seat leftside1[][] = new Seat [4] [4];
    Seat midside1[][] = new Seat [4] [4];
    Seat rightside1[][] = new Seat [4] [4]; // Each one of these creates an array for each block

    Seat leftside3[][] = new Seat [4] [4];
    Seat midside3[][] = new Seat [4] [4];
    Seat rightside3[][] = new Seat [4] [4];

    Seat leftside5[][] = new Seat [4] [4];
    Seat midside5[][] = new Seat [4] [4];
    Seat rightside5[][] = new Seat [4] [4];

    Seat leftside7[][] = new Seat [4] [4];
    Seat midside7[][] = new Seat [4] [4];
    Seat rightside7[][] = new Seat [4] [4];

    Seat leftside9[][] = new Seat [4] [4];
    Seat midside9[][] = new Seat [4] [4];
    Seat rightside9[][] = new Seat [4] [4];
    
        Seat leftside11[][] = new Seat [4] [4];
    Seat midside11[][] = new Seat [4] [4];
    Seat rightside11[][] = new Seat [4] [4]; // Each one of these creates an array for each block

    Seat leftside33[][] = new Seat [4] [4];
    Seat midside33[][] = new Seat [4] [4];
    Seat rightside33[][] = new Seat [4] [4];

    Seat leftside55[][] = new Seat [4] [4];
    Seat midside55[][] = new Seat [4] [4];
    Seat rightside55[][] = new Seat [4] [4];

    Seat leftside77[][] = new Seat [4] [4];
    Seat midside77[][] = new Seat [4] [4];
    Seat rightside77[][] = new Seat [4] [4];

    Seat leftside99[][] = new Seat [4] [4];
    Seat midside99[][] = new Seat [4] [4];
    Seat rightside99[][] = new Seat [4] [4];
    
        Seat leftside111[][] = new Seat [4] [4];
    Seat midside111[][] = new Seat [4] [4];
    Seat rightside111[][] = new Seat [4] [4]; // Each one of these creates an array for each block

    Seat leftside333[][] = new Seat [4] [4];
    Seat midside333[][] = new Seat [4] [4];
    Seat rightside333[][] = new Seat [4] [4];

    Seat leftside555[][] = new Seat [4] [4];
    Seat midside555[][] = new Seat [4] [4];
    Seat rightside555[][] = new Seat [4] [4];

    Seat leftside777[][] = new Seat [4] [4];
    Seat midside777[][] = new Seat [4] [4];
    Seat rightside777[][] = new Seat [4] [4];

    Seat leftside999[][] = new Seat [4] [4];
    Seat midside999[][] = new Seat [4] [4];
    Seat rightside999[][] = new Seat [4] [4];
    Ticket tickets[] = new Ticket[30]; //Array for storing the tickets booked

    public booking11()
    {
        setSize(800,500);
        setLocation(200,200);
        setResizable(false);
        setLayout(new FlowLayout());
        ImageIcon imgtitle = new ImageIcon("title.gif");
        title = new JLabel(imgtitle);
        typelbl = new JLabel("Select Movie: ");
        typelbl.setFont(new Font("Verdana", Font.BOLD, 22));
        type = new Choice();
        type.add("Spider-Man: No Way Home");
        type.add("Doctor Strange in the Multiverse of Madness");
        type.add("Avengers: Endgame");
        blocklbl = new JLabel("Block:");
        blocklbl.setFont(new Font("Verdana", Font.BOLD, 22));
        block = new Choice();
        block.add("Left Block");
        block.add("Middle Block");
        block.add("Right Block");
        timelbl = new JLabel("Time: ");
        timelbl.setFont(new Font("Verdana", Font.BOLD, 22));
        time = new Choice();
        time.add("13:00");
        time.add("15:00");
        time.add("17:00");
        time.add("19:00");
        time.add("21:00");
        paybut = new JButton("Pay");
        paybut.setBackground(Color.white);
        ImageIcon lbimg = new ImageIcon("lblogo.gif");
        lblbl = new JLabel (lbimg);
        ImageIcon mbimg = new ImageIcon("mblogo.gif");
        mblbl = new JLabel (mbimg);
        ImageIcon rbimg = new ImageIcon("rblogo.gif");
        rblbl = new JLabel (rbimg);
        inputseatlbl = new JLabel ("Enter Seat Num: ");
        inputseatlbl.setFont(new Font("Verdana", Font.BOLD, 22));
        seat = new JTextField(2);
        seat.setFont(new Font("Verdana", Font.BOLD, 20));
        seat.setHorizontalAlignment(seat.CENTER);
        totallbl = new JLabel ("Total Price: ");
        totallbl.setFont(new Font("Verdana", Font.BOLD, 22));
        totalcost = new JTextField(5);
        totalcost.setFont(new Font("Verdana", Font.BOLD, 22));
        totalcost.setHorizontalAlignment(totalcost.CENTER);
        totalcost.setEditable(false);
        submitbut = new JButton("Submit");
        submitbut.setBackground(Color.white);
        showbut = new JButton("Show");
        showbut.setBackground(Color.white);
        nmlbl = new JLabel ("Enter your name: ");
        nmlbl.setFont(new Font("Verdana", Font.BOLD, 22));
         nmlbl.setHorizontalAlignment(name.CENTER);
        name = new JTextField(20);
        name.setFont(new Font("Verdana", Font.BOLD, 25));
        nmlbl.setHorizontalAlignment(name.CENTER);
        
        

        /* The following delcarations
        initialise the variables for
        the positions of the blocks */

        int xleft = 0;
        int yleft = 0;
        int xmid = 0;
        int ymid = 0;
        int xright = 0;
        int yright = 0;


        xleft = 50;
        yleft = 310; //Initial positions
        int totalleftside1 = 0; //'Total' is the total and is used to label the seats
    
        for (int i = 0; i < leftside1.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside1[i][j]=new Seat(totalleftside1, 0, xleft, yleft);
                xleft += 50; //Moving the next seat along the x position by 50
                totalleftside1 ++; //Adding one to the total for the next seat
            }
            xleft = 50; //Moving back to the left for the next row
            yleft += 30; //Moving down for the next row
        }

        xmid = 300;
        ymid = 310; //Initial positions
        int totalmidside1 = 0; //'Total' is the total and is used to label the seats
        for (int i = 0; i < midside1.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside1[i][j]=new Seat(totalmidside1, 0, xmid, ymid);
                xmid += 50; //Moving the next seat along the x position by 50
                totalmidside1 ++; //Adding one to the total for the next seat
            }
            xmid = 300; //Moving back to the left for the next row
            ymid += 30;  //Moving down for the next row
        }

        xright = 550;
        yright = 310; //Initial positions
        int totalrightside1 = 0; //'Total' is the total and is used to label the seats
        for (int i = 0; i < rightside1.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside1[i][j]=new Seat(totalrightside1, 0, xright, yright);
                xright += 50; //Moving the next seat along the x position by 50
                totalrightside1 ++; //Adding one to the total for the next seat
            }
            xright = 550; //Moving back to the left for the next row
            yright += 30; //Moving down for the next row
        }

        /* The next lines of code perform the same processes as the ones before such as positions for each block */

        xleft = 50;
        yleft = 310;
        int totalleftside3 = 0;

        for (int i = 0; i < leftside3.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside3[i][j]=new Seat(totalleftside3, 0, xleft, yleft);
                xleft += 50;
                totalleftside3 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside3 = 0;
        for (int i = 0; i < midside3.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside3[i][j]=new Seat(totalmidside3, 0, xmid, ymid);
                xmid += 50;
                totalmidside3 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside3 = 0;
        for (int i = 0; i < rightside3.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside3[i][j]=new Seat(totalrightside3, 0, xright, yright);
                xright += 50;
                totalrightside3 ++;
            }
            xright = 550;
            yright += 30;
        }


        xleft = 50;
        yleft = 310;
        int totalleftside5 = 0;

        for (int i = 0; i < leftside5.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside5[i][j]=new Seat(totalleftside5, 0, xleft, yleft);
                xleft += 50;
                totalleftside5 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside5 = 0;
        for (int i = 0; i < midside5.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside5[i][j]=new Seat(totalmidside5, 0, xmid, ymid);
                xmid += 50;
                totalmidside5 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside5 = 0;
        for (int i = 0; i < rightside5.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside5[i][j]=new Seat(totalrightside5, 0, xright, yright);
                xright += 50;
                totalrightside5 ++;
            }
            xright = 550;
            yright += 30;
        }


        xleft = 50;
        yleft = 310;
        int totalleftside7 = 0;

        for (int i = 0; i < leftside7.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside7[i][j]=new Seat(totalleftside7, 0, xleft, yleft);
                xleft += 50;
                totalleftside7 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside7 = 0;
        for (int i = 0; i < midside7.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside7[i][j]=new Seat(totalmidside7, 0, xmid, ymid);
                xmid += 50;
                totalmidside7 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside7 = 0;
        for (int i = 0; i < rightside7.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside7[i][j]=new Seat(totalrightside7, 0, xright, yright);
                xright += 50;
                totalrightside7 ++;
            }
            xright = 550;
            yright += 30;
        }

        xleft = 50;
        yleft = 310;
        int totalleftside9 = 0;

        for (int i = 0; i < leftside9.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside9[i][j]=new Seat(totalleftside9, 0, xleft, yleft);
                xleft += 50;
                totalleftside9 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside9 = 0;
        for (int i = 0; i < midside9.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside9[i][j]=new Seat(totalmidside9, 0, xmid, ymid);
                xmid += 50;
                totalmidside9 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside9 = 0;
        for (int i = 0; i < rightside9.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside9[i][j]=new Seat(totalrightside9, 0, xright, yright);
                xright += 50;
                totalrightside9 ++;
            }
            xright = 550;
            yright += 30;
        }
        
        xleft = 50;
        yleft = 310; //Initial positions
        int totalleftside11 = 0; //'Total' is the total and is used to label the seats
    
        for (int i = 0; i < leftside11.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside11[i][j]=new Seat(totalleftside11, 0, xleft, yleft);
                xleft += 50; //Moving the next seat along the x position by 50
                totalleftside11 ++; //Adding one to the total for the next seat
            }
            xleft = 50; //Moving back to the left for the next row
            yleft += 30; //Moving down for the next row
        }

        xmid = 300;
        ymid = 310; //Initial positions
        int totalmidside11 = 0; //'Total' is the total and is used to label the seats
        for (int i = 0; i < midside11.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside11[i][j]=new Seat(totalmidside11, 0, xmid, ymid);
                xmid += 50; //Moving the next seat along the x position by 50
                totalmidside11 ++; //Adding one to the total for the next seat
            }
            xmid = 300; //Moving back to the left for the next row
            ymid += 30;  //Moving down for the next row
        }

        xright = 550;
        yright = 310; //Initial positions
        int totalrightside11 = 0; //'Total' is the total and is used to label the seats
        for (int i = 0; i < rightside11.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside11[i][j]=new Seat(totalrightside11, 0, xright, yright);
                xright += 50; //Moving the next seat along the x position by 50
                totalrightside11 ++; //Adding one to the total for the next seat
            }
            xright = 550; //Moving back to the left for the next row
            yright += 30; //Moving down for the next row
        }

        /* The next lines of code perform the same processes as the ones before such as positions for each block */

        xleft = 50;
        yleft = 310;
        int totalleftside33 = 0;

        for (int i = 0; i < leftside33.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside33[i][j]=new Seat(totalleftside33, 0, xleft, yleft);
                xleft += 50;
                totalleftside33 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside33 = 0;
        for (int i = 0; i < midside33.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside33[i][j]=new Seat(totalmidside33, 0, xmid, ymid);
                xmid += 50;
                totalmidside33 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside33 = 0;
        for (int i = 0; i < rightside33.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside33[i][j]=new Seat(totalrightside33, 0, xright, yright);
                xright += 50;
                totalrightside33 ++;
            }
            xright = 550;
            yright += 30;
        }


        xleft = 50;
        yleft = 310;
        int totalleftside55 = 0;

        for (int i = 0; i < leftside55.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside55[i][j]=new Seat(totalleftside55, 0, xleft, yleft);
                xleft += 50;
                totalleftside55 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside55 = 0;
        for (int i = 0; i < midside55.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside55[i][j]=new Seat(totalmidside55, 0, xmid, ymid);
                xmid += 50;
                totalmidside55 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside55 = 0;
        for (int i = 0; i < rightside55.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside55[i][j]=new Seat(totalrightside55, 0, xright, yright);
                xright += 50;
                totalrightside55 ++;
            }
            xright = 550;
            yright += 30;
        }


        xleft = 50;
        yleft = 310;
        int totalleftside77 = 0;

        for (int i = 0; i < leftside77.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside77[i][j]=new Seat(totalleftside77, 0, xleft, yleft);
                xleft += 50;
                totalleftside77 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside77 = 0;
        for (int i = 0; i < midside77.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside77[i][j]=new Seat(totalmidside77, 0, xmid, ymid);
                xmid += 50;
                totalmidside77 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside77 = 0;
        for (int i = 0; i < rightside77.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside77[i][j]=new Seat(totalrightside77, 0, xright, yright);
                xright += 50;
                totalrightside77 ++;
            }
            xright = 550;
            yright += 30;
        }

        xleft = 50;
        yleft = 310;
        int totalleftside99 = 0;

        for (int i = 0; i < leftside99.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside99[i][j]=new Seat(totalleftside99, 0, xleft, yleft);
                xleft += 50;
                totalleftside99 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside99 = 0;
        for (int i = 0; i < midside99.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside9[i][j]=new Seat(totalmidside99, 0, xmid, ymid);
                xmid += 50;
                totalmidside99 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside99 = 0;
        for (int i = 0; i < rightside99.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside99[i][j]=new Seat(totalrightside99, 0, xright, yright);
                xright += 50;
                totalrightside99 ++;
            }
            xright = 550;
            yright += 30;
        }
        
        xleft = 50;
        yleft = 310; //Initial positions
        int totalleftside111 = 0; //'Total' is the total and is used to label the seats
    
        for (int i = 0; i < leftside111.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside111[i][j]=new Seat(totalleftside111, 0, xleft, yleft);
                xleft += 50; //Moving the next seat along the x position by 50
                totalleftside111 ++; //Adding one to the total for the next seat
            }
            xleft = 50; //Moving back to the left for the next row
            yleft += 30; //Moving down for the next row
        }

        xmid = 300;
        ymid = 310; //Initial positions
        int totalmidside111 = 0; //'Total' is the total and is used to label the seats
        for (int i = 0; i < midside111.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside111[i][j]=new Seat(totalmidside111, 0, xmid, ymid);
                xmid += 50; //Moving the next seat along the x position by 50
                totalmidside111 ++; //Adding one to the total for the next seat
            }
            xmid = 300; //Moving back to the left for the next row
            ymid += 30;  //Moving down for the next row
        }

        xright = 550;
        yright = 310; //Initial positions
        int totalrightside111 = 0; //'Total' is the total and is used to label the seats
        for (int i = 0; i < rightside111.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside111[i][j]=new Seat(totalrightside111, 0, xright, yright);
                xright += 50; //Moving the next seat along the x position by 50
                totalrightside111 ++; //Adding one to the total for the next seat
            }
            xright = 550; //Moving back to the left for the next row
            yright += 30; //Moving down for the next row
        }

        /* The next lines of code perform the same processes as the ones before such as positions for each block */

        xleft = 50;
        yleft = 310;
        int totalleftside333 = 0;

        for (int i = 0; i < leftside333.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside333[i][j]=new Seat(totalleftside333, 0, xleft, yleft);
                xleft += 50;
                totalleftside333 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside333 = 0;
        for (int i = 0; i < midside333.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside333[i][j]=new Seat(totalmidside333, 0, xmid, ymid);
                xmid += 50;
                totalmidside333 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside333 = 0;
        for (int i = 0; i < rightside333.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside333[i][j]=new Seat(totalrightside333, 0, xright, yright);
                xright += 50;
                totalrightside333 ++;
            }
            xright = 550;
            yright += 30;
        }


        xleft = 50;
        yleft = 310;
        int totalleftside555 = 0;

        for (int i = 0; i < leftside555.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside555[i][j]=new Seat(totalleftside555, 0, xleft, yleft);
                xleft += 50;
                totalleftside555 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside555 = 0;
        for (int i = 0; i < midside555.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside555[i][j]=new Seat(totalmidside555, 0, xmid, ymid);
                xmid += 50;
                totalmidside555 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside555 = 0;
        for (int i = 0; i < rightside555.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside555[i][j]=new Seat(totalrightside555, 0, xright, yright);
                xright += 50;
                totalrightside555 ++;
            }
            xright = 550;
            yright += 30;
        }


        xleft = 50;
        yleft = 310;
        int totalleftside777 = 0;

        for (int i = 0; i < leftside777.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside777[i][j]=new Seat(totalleftside777, 0, xleft, yleft);
                xleft += 50;
                totalleftside777 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside777 = 0;
        for (int i = 0; i < midside777.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside777[i][j]=new Seat(totalmidside777, 0, xmid, ymid);
                xmid += 50;
                totalmidside777 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside777 = 0;
        for (int i = 0; i < rightside777.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside777[i][j]=new Seat(totalrightside777, 0, xright, yright);
                xright += 50;
                totalrightside777 ++;
            }
            xright = 550;
            yright += 30;
        }

        xleft = 50;
        yleft = 310;
        int totalleftside999 = 0;

        for (int i = 0; i < leftside999.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside999[i][j]=new Seat(totalleftside999, 0, xleft, yleft);
                xleft += 50;
                totalleftside999 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside999 = 0;
        for (int i = 0; i < midside999.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside999[i][j]=new Seat(totalmidside999, 0, xmid, ymid);
                xmid += 50;
                totalmidside999 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside999 = 0;
        for (int i = 0; i < rightside999.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside999[i][j]=new Seat(totalrightside999, 0, xright, yright);
                xright += 50;
                totalrightside999 ++;
            }
            xright = 550;
            yright += 30;
        }
        /* Adding the labels and text boxes to the screen */

        getContentPane().add(title);
        getContentPane().add(typelbl);
        getContentPane().add(type);
        getContentPane().add(nmlbl);
        getContentPane().add(blocklbl);
        getContentPane().add(block);
        getContentPane().add(timelbl);
        getContentPane().add(time);
        getContentPane().add(showbut);
        getContentPane().add(inputseatlbl);
        getContentPane().add(seat);
        getContentPane().add(submitbut);
        getContentPane().add(totallbl);
        getContentPane().add(totalcost);
        getContentPane().add(paybut);
        getContentPane().add(lblbl);
        getContentPane().add(mblbl);
        getContentPane().add(rblbl);
        getContentPane().add(nmlbl);
        getContentPane().add(name);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Color mycolor = new Color(255,255,255);
        getContentPane().setBackground(mycolor);

        submitbut.addActionListener(this);
        showbut.addActionListener(this); //Action listener for each individual button
        paybut.addActionListener(this);
    }
    public void paint(Graphics graf)
    {
        super.paint(graf);
      
        switch(timechoice)
        {
            case 1:
                for (int i = 0; i < leftside1.length; i++) //Looping throw the leftside at 1 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside1[i][j].display(graf); //Displaying the left side @ 1
                        midside1[i][j].display(graf); //Displaying the mid side @ 1
                        rightside1[i][j].display(graf); //Displaying the right side @ 1
                    }
                }
                break;
            case 3:
                for (int i = 0; i < leftside3.length; i++) //Looping through the leftside at 3 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside3[i][j].display(graf); //Displaying the left side @ 3
                        midside3[i][j].display(graf); //Displaying the mid side @ 3
                        rightside3[i][j].display(graf); //Displaying the right side @ 3
                    }
                }
                break;
            case 5:
                for (int i = 0; i < leftside5.length; i++) //Looping through the leftside at 5 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside5[i][j].display(graf); //Displaying the left side @ 5
                        midside5[i][j].display(graf); //Displaying the mid side @ 5
                        rightside5[i][j].display(graf); //Displaying the right side @ 5
                    }
                }
                break;
            case 7:
                for (int i = 0; i < leftside7.length; i++) //Looping through the leftside at 7 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside7[i][j].display(graf); //Displaying the left side @ 7
                        midside7[i][j].display(graf); //Displaying the mid side @ 7
                        rightside7[i][j].display(graf); //Displaying the right side @ 7
                    }
                }
                break;
            case 9:
                for (int i = 0; i < leftside9.length; i++) //Looping through the leftside at 7 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside9[i][j].display(graf); //Displaying the left side @ 7
                        midside9[i][j].display(graf); //Displaying the mid side @ 7
                        rightside9[i][j].display(graf); //Displaying the right side @ 7
                    }
                }
                break;
            default:
            /* Used as what appears when the program starts */
                for (int i = 0; i < leftside1.length; i++) //Looping through the leftside at 1 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside1[i][j].display(graf); //Displaying the left side @ 1
                        midside1[i][j].display(graf); //Displaying the mid side @ 1
                        rightside1[i][j].display(graf); //Displaying the right side @ 1
                    }
                }
                break;
                  case 11:
                for (int i = 0; i < leftside11.length; i++) //Looping throw the leftside at 1 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside11[i][j].display(graf); //Displaying the left side @ 1
                        midside11[i][j].display(graf); //Displaying the mid side @ 1
                        rightside11[i][j].display(graf); //Displaying the right side @ 1
                    }
                }
                break;
            case 33:
                for (int i = 0; i < leftside33.length; i++) //Looping through the leftside at 3 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside33[i][j].display(graf); //Displaying the left side @ 3
                        midside33[i][j].display(graf); //Displaying the mid side @ 3
                        rightside33[i][j].display(graf); //Displaying the right side @ 3
                    }
                }
                break;
            case 55:
                for (int i = 0; i < leftside55.length; i++) //Looping through the leftside at 5 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside55[i][j].display(graf); //Displaying the left side @ 5
                        midside55[i][j].display(graf); //Displaying the mid side @ 5
                        rightside55[i][j].display(graf); //Displaying the right side @ 5
                    }
                }
                break;
            case 77:
                for (int i = 0; i < leftside77.length; i++) //Looping through the leftside at 7 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside77[i][j].display(graf); //Displaying the left side @ 7
                        midside77[i][j].display(graf); //Displaying the mid side @ 7
                        rightside77[i][j].display(graf); //Displaying the right side @ 7
                    }
                }
                break;
          case 99:
                for (int i = 0; i < leftside99.length; i++) //Looping through the leftside at 7 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside99[i][j].display(graf); //Displaying the left side @ 7
                        midside99[i][j].display(graf); //Displaying the mid side @ 7
                        rightside99[i][j].display(graf); //Displaying the right side @ 7
                    }
                }
                break;
          
            case 111:
                for (int i = 0; i < rightside111.length; i++) //Looping throw the leftside at 1 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside111[i][j].display(graf); //Displaying the left side @ 1
                        midside111[i][j].display(graf); //Displaying the mid side @ 1
                        rightside111[i][j].display(graf); //Displaying the right side @ 1
                    }
                }
                break;
            case 333:
                for (int i = 0; i < leftside333.length; i++) //Looping through the leftside at 3 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside333[i][j].display(graf); //Displaying the left side @ 3
                        midside333[i][j].display(graf); //Displaying the mid side @ 3
                        rightside333[i][j].display(graf); //Displaying the right side @ 3
                    }
                }
                break;
            case 555:
                for (int i = 0; i < leftside55.length; i++) //Looping through the leftside at 5 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside555[i][j].display(graf); //Displaying the left side @ 5
                        midside555[i][j].display(graf); //Displaying the mid side @ 5
                        rightside555[i][j].display(graf); //Displaying the right side @ 5
                    }
                }
                break;
            case 777:
                for (int i = 0; i < leftside777.length; i++) //Looping through the leftside at 7 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside777[i][j].display(graf); //Displaying the left side @ 7
                        midside777[i][j].display(graf); //Displaying the mid side @ 7
                        rightside777[i][j].display(graf); //Displaying the right side @ 7
                    }
                }
                break;
            case 999:
                for (int i = 0; i < leftside999.length; i++) //Looping through the leftside at 7 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside999[i][j].display(graf); //Displaying the left side @ 7
                        midside999[i][j].display(graf); //Displaying the mid side @ 7
                        rightside999[i][j].display(graf); //Displaying the right side @ 7
                    }
                }
                break;
   
        }
    }
    public void actionPerformed(ActionEvent ev)
    {
        selectedblock = block.getSelectedItem(); //The values neeeded to book seats and check for availability taken from text boxes
        selectedtime = time.getSelectedItem();
        tickettype = type.getSelectedItem();
        getname = name.getText();
        if (ev.getSource() == submitbut)
        {
            selectedseat = seat.getText();
            int selectseat = Integer.parseInt(selectedseat); //Getting the seat number and converting it to an integer
            
            
            /* The following set of if statements checks for seat number and converts it
            to an X, Y position which can be used for booking */

            if (selectseat == 0)
                {convertedseat1 = 0;
                convertedseat2 = 0;}
            if (selectseat == 1)
                {convertedseat1 = 0;
                convertedseat2 = 1;}
            if (selectseat == 2)
                {convertedseat1 = 0;
                convertedseat2 = 2;}
            if (selectseat == 3)
                {convertedseat1 = 0;
                convertedseat2 = 3;}
            if (selectseat == 4)
                {convertedseat1 = 1;
                convertedseat2 = 0;}
            if (selectseat == 5)
                {convertedseat1 = 1;
                convertedseat2 = 1;}
            if (selectseat == 6)
                {convertedseat1 = 1;
                convertedseat2 = 2;}
            if (selectseat == 7)
                {convertedseat1 = 1;
                convertedseat2 = 3;}
            if (selectseat == 8)
                {convertedseat1 = 2;
                convertedseat2 = 0;}
            if (selectseat == 9)
                {convertedseat1 =2;
                convertedseat2 = 1;}
            if (selectseat == 10)
                {convertedseat1 = 2;
                convertedseat2 = 2;}
            if (selectseat == 11)
                {convertedseat1 = 2;
                convertedseat2 = 3;}
            if (selectseat == 12)
                {convertedseat1 = 3;
                convertedseat2 = 0;}
            if (selectseat == 13)
                {convertedseat1 = 3;
                convertedseat2 = 1;}
            if (selectseat == 14)
                {convertedseat1 = 3;
                convertedseat2 = 2;}
            if (selectseat == 15)
                {convertedseat1 = 3;
                convertedseat2 = 3;}
            
                  
                if (selectedtime == "13:00"&&tickettype== "Avengers: Endgame") //If they are trying to book a ticket a 1 o'clock
                {
                timechoice = 11;
                repaint();
                
                if (selectedblock == "Left Block") // If they are trying to book a seat in the left block
                {
                    int iftaken = leftside11[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked"); //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        leftside11[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint(); //Re-displays it
                        
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime); //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice(); //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")  // If they are trying to book a seat in the middle block
                {
                    int iftaken = midside11[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked"); //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        midside11[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime); //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice();  //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")  // If they are trying to book a seat in the right block
                {
                    int iftaken = rightside11[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");  //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        rightside11[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);  //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice(); //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
            }
                
            /* Code is replicated for each of the times the user wants to book*/

            if (selectedtime == "15:00"&&tickettype== "Avengers: Endgame")
            {
                timechoice = 33;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside33[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside33[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside33[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside33[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside33[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside33[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }

            }
            if (selectedtime == "17:00"&&tickettype== "Avengers: Endgame")
            {
                timechoice = 55;
                repaint();

                if (selectedblock == "Left Block"&&tickettype== "Avengers: Endgame")
                {
                    int iftaken = leftside55[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside55[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside55[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside55[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside55[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside55[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
            if (selectedtime == "19:00"&&tickettype== "Avengers: Endgame")
            {
                timechoice = 77;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside77[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside77[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside77[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside77[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside77[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside77[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
            if (selectedtime == "21:00"&&tickettype== "Avengers: Endgame")
            {
                timechoice = 99;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside99[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside99[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside99[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside99[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside99[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside99[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
        
                    

                if (selectedtime == "13:00"&&tickettype== "Spider-Man: No Way Home") //If they are trying to book a ticket a 1 o'clock
                {
                timechoice = 111;
                repaint();
                if (selectedblock == "Left Block") // If they are trying to book a seat in the left block
                {
                    int iftaken = leftside111[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked"); //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        leftside111[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint(); //Re-displays it
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime); //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice(); //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")  // If they are trying to book a seat in the middle block
                {
                    int iftaken = midside111[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked"); //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        midside111[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime); //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice();  //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")  // If they are trying to book a seat in the right block
                {
                    int iftaken = rightside111[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");  //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        rightside111[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);  //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice(); //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
            }
            
            /* Code is replicated for each of the times the user wants to book*/

            if (selectedtime == "15:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 333;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside333[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside333[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside333[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside333[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside333[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside333[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }

            }
            if (selectedtime == "17:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 555;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside555[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside555[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside555[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside555[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside555[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside555[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
            if (selectedtime == "19:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 777;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside777[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside777[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside777[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside7[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside777[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside777[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
            if (selectedtime == "21:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 999;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside999[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside999[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside999[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside999[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside999[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside999[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
        
          
                if (selectedtime == "13:00"&& tickettype =="Doctor Strange in the Multiverse of Madness") //If they are trying to book a ticket a 1 o'clock
                {
                timechoice = 1;
                repaint();
                if (selectedblock == "Left Block") // If they are trying to book a seat in the left block
                {
                    int iftaken = leftside1[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked"); //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        leftside1[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint(); //Re-displays it
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime); //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice(); //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")  // If they are trying to book a seat in the middle block
                {
                    int iftaken = midside1[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked"); //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        midside1[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime); //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice();  //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")  // If they are trying to book a seat in the right block
                {
                    int iftaken = rightside1[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");  //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        rightside1[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);  //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice(); //Gets the seat price using the getSeatPrice() method
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
            }
            
            /* Code is replicated for each of the times the user wants to book*/

            if (selectedtime == "15:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 3;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside3[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside3[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside3[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside3[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside3[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside3[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }

            }
            if (selectedtime == "17:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 5;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside5[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside5[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside5[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside5[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside5[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside5[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
            if (selectedtime == "19:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 7;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside7[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside7[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside7[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside7[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside7[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside7[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
            if (selectedtime == "21:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 9;
                repaint();

                if (selectedblock == "Left Block")
                {
                    int iftaken = leftside9[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside9[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Middle Block")
                {
                    int iftaken = midside9[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside9[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock == "Right Block")
                {
                    int iftaken = rightside9[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside9[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice = totalprice + tempprice;
                        totalcost.setText("₱"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
        }
        

        if (ev.getSource() == showbut)
        {
            /* If the user has clicked the show button it sets a variable and then repaints the desired time */

            if (selectedtime == "13:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 1;
                repaint();
            }
            if (selectedtime == "15:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 3;
                repaint();
            }
            if (selectedtime == "17:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 5;
                repaint();
            }
            if (selectedtime == "19:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 7;
                repaint();
            }
            if(selectedtime == "21:00"&& tickettype =="Doctor Strange in the Multiverse of Madness")
            {
                timechoice = 9;
                repaint();
            }
            
               if (selectedtime == "13:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 111;
                repaint();
            }
            if (selectedtime == "15:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 333;
                repaint();
            }
            if (selectedtime == "17:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 555;
                repaint();
            }
            if (selectedtime == "19:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 777;
                repaint();
            }
            if(selectedtime == "21:00"&&tickettype== "Spider-Man: No Way Home")
            {
                timechoice = 999;
                repaint();
            }
                if (selectedtime == "13:00"&& tickettype =="Avengers: Endgame")
            {
                timechoice = 11;
                repaint();
            }
            if (selectedtime == "15:00"&& tickettype =="Avengers: Endgame")
            {
                timechoice = 33;
                repaint();
            }
            if (selectedtime == "17:00"&& tickettype =="Avengers: Endgame")
            {
                timechoice = 55;
                repaint();
            }
            if (selectedtime == "19:00"&& tickettype =="Avengers: Endgame")
            {
                timechoice = 77;
                repaint();
            }
            if(selectedtime == "21:00"&& tickettype =="Avengers: Endgame")
            {
                timechoice = 99;
                repaint();
            }
        }
    
        if (ev.getSource() == paybut) //Pay button to generate tickets
        {

                  try{
                      FileWriter stream= new FileWriter("tickets.txt"); //Opening the tickets.txt file
                      BufferedWriter output = new BufferedWriter(stream);

                    for (int i = 0; i < totaltickets; i++) //Looping through the number of tickets booked
                    {
                          /* Getting the variables needed from methods related to the object */

                          int ticketnum = tickets[i].getSeatNum();
                        int ticketprice = tickets[i].getSeatPrice();
                        
                        String tickettype = tickets[i].getType();
                        String tickettime = tickets[i].getTime();
                        String ticketblock = tickets[i].getBlock();
                        String newline = System.getProperty("line.separator");

                        output.write(newline);
                        output.write("Ticket Details");
                        output.write(newline);
                          output.write("Name: " + getname); //Writing ticketnum
                        output.write(newline);
                        output.write(newline);
                        output.write("Ticket Number: " + ticketnum); //Writing ticketnum
                        output.write(newline);
                        output.write("Price: " + ticketprice);
                         output.write(newline);
                        output.write("Ticket Price: " + ticketprice);
                        output.write(newline);
                        output.write("Ticket Type: " + tickettype);
                        output.write(newline);
                        output.write("Ticket Time: " + tickettime);
                        output.write(newline);
                        output.write("Ticket Block: " + ticketblock);
                        output.write(newline);
                        output.write("____________________________________________________________________________________");
                        output.write(newline);
                    }
                    output.close();
                      }catch (Exception e){//Catch exception if any
                      System.err.println("Error: " + e.getMessage());}

                  JOptionPane.showMessageDialog(null, "These tickets have been printed out to the file 'tickets.txt'"); //Success message

                  for(int i=0; i < tickets.length; i++)
                  {
                    tickets[i] = null; //Setting the tickets array values to null so new tickets can be booked
                }
                totaltickets = 0; //Resets totaltickets to 0
                totalprice = 0; //Resets totalprice to 0
                totalcost.setText(""); //Sets totalcost to an empty text field
                seat.setText(""); 
                name.setText("");

        }
    }
    public static void main(String args[])
    {
        new booking11();
    }
}
class Seat
{
    private final int boxheight = 30; //Height of the drawn text box
    private final int boxwidth = 50; //Width of the drawn text box
    private int seatnumber;
    private int seattaken;
    private int x;
    private int y;

    public Seat(int number, int taken, int xstart, int ystart)
    {
        seatnumber = number; //Setting the seatnumber
        seattaken = taken; //Setting whether it is taken
        x = xstart; //Display position
        y = ystart;
    }
    public void display(Graphics graf)
    {
        int xdraw, ydraw;
        switch (seattaken)
        {
        case 0:
            xdraw = x +  boxwidth;
            ydraw = y +  boxheight;
            graf.drawRect(x,y,boxwidth,boxheight);
            graf.drawString(Integer.toString(seatnumber),x+20,y+boxheight*3/4); //Painting the seat with the seat number printed inside
            break;
        case 1:
            xdraw = x +  boxwidth;
            ydraw = y +  boxheight;
            graf.drawRect(x,y,boxwidth,boxheight);
            String msg = "N/A";
            graf.drawString(msg,x+20,y+boxheight*3/4); //Painting the seat with N/A printed inside
            break;
        default:
            break;
        }

    }
    public int isTaken()
    {
        return seattaken;
    }
    public void setSeat()
    {
        seattaken = 1;
    }
}
class Ticket
{
    private int price;
    private String tickettype;
    private int seatnum;
    private String timeticket;
    private String blockticket;


    public Ticket (String type, int seatnumber, String block, String time)
    {
        seatnum = seatnumber; //Setting tickets seat number
        tickettype = type; //Setting ticket type
        blockticket = block; //Setting block
        timeticket = time; //Setting time

        if (blockticket == "Left Block")
        {
            price = 300;
        }

        if (blockticket == "Middle Block")
        {
            price = 300;
        }

        if (blockticket == "Right Block")
        {

            price = 300;
        }
    }
    /* The following get methods are used to print tickets */
    public int getSeatPrice()
    {
        return price;
    }
    public String getTime()
    {
        return timeticket;
    }
    public String getBlock()
    {
        return blockticket;
    }
    public String getType()
    {
        return tickettype;
    }
    public int getSeatNum()
    {
        return seatnum;
    }
}
