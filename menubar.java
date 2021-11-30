import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class meanubar implements ActionListener {
    JButton b1,b2;
    JFrame f;
    meanubar()
    {
        JMenu me=new JMenu("File");
        JMenuBar mb=new JMenuBar();
        //JInternalFrame.JDesktopIcon i=new JInternalFrame.JDesktopIcon("/java/new.Gif");

        ImageIcon i=new ImageIcon("f:/java/new.gif");
        JMenuItem mi=new JMenuItem("open"),mi2=new JMenuItem("save");

        JToolBar tb=new JToolBar();
        b1=new JButton(i);
        b2=new JButton("xyz");
        // b1.removeNotify();
        //  b1.setEnabled(false);
        b1.addActionListener(this);
        f=new JFrame();
        tb.add(b1);
        tb.add(b2);
        me.add(mi);
        me.add(mi2);
        mb.add(me);
        f.setJMenuBar(mb);
        b2.addActionListener(this);
        f.add(tb);
        f.setVisible(true);
        f.setSize(200,200);


    }
    @Override

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
            JOptionPane.showInputDialog(f,"abc");
            if (b1.isEnabled()){
                b1.setEnabled(false);}
            else
            {
                b1.setEnabled(true);
            }
        }
    }
    public static void main(String[] args) {
        meanubar n=new meanubar();
    }
}
