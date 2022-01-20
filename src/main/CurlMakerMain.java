package main;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CurlMakerMain {
    
    private static String platform[] = {"EPC", "G-Cloud"};
    private static String svc[] = {"Token", "User", "Server", "Project", "Role", "Flavor", "Keypair", 
                                    "Volume", "ServerImage", "Snapshot", "Image", "Vpc", "Network", 
                                    "Account", "Firewall", "IpAddress", "PortforwardingRule", "StaticRoute", 
                                    "StaticNat", "Port"};
    private static String cmd[] = {"CREATE", "DELETE", "UPDATE", "LIST", "LIST(DETAIL)", "ATTACH", "DETACH", 
                                    "REACTIVATE", "DEACTIVATE", "ASSOCIATE", "DISASSOCIATE"};
    private static String endpoint[] = {"Local", "Stack"};

    public static JComboBox jcbPlatfrom;
    public static JComboBox jcbSvc;
    public static JComboBox jcbCmd;
    public static JComboBox jcbEndpoint;

    public static void testGui() {
        JFrame frame = new JFrame("C-Url Maker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,150,620, 600);
        frame.setLayout(null);

        //화면 삼분할을 위한 JPanel 구성
        JPanel jpTop = new JPanel();
        jpTop.setBounds(0, 0, 620, 300);
        jpTop.setBackground(new Color(100, 0, 0, 100));
        jpTop.setLayout(null);
        JPanel jpMiddle = new JPanel();
        jpMiddle.setBounds(0, 300, 620, 180);
        jpMiddle.setBackground(new Color(0, 100, 0, 100));
        jpMiddle.setLayout(null);
        JPanel jpBottom = new JPanel();
        jpBottom.setBounds(0, 480, 620, 120);
        jpBottom.setBackground(new Color(0, 0, 100, 100));
        jpBottom.setLayout(null);

        frame.getContentPane().add(jpTop);
        frame.getContentPane().add(jpMiddle);
        frame.getContentPane().add(jpBottom);

        //상단 패널에 위치시킬 JComboBox
        jcbPlatfrom = new JComboBox<String>(platform);
        jcbPlatfrom.setBounds(35, 40, 110, 40);
        jpTop.add(jcbPlatfrom);
        
        jcbSvc = new JComboBox<String>(svc);
        jcbSvc.setBounds(175, 40, 110, 40);
        jpTop.add(jcbSvc);
        
        jcbCmd = new JComboBox<String>(cmd);
        jcbCmd.setBounds(315, 40, 110, 40);
        jpTop.add(jcbCmd);
        
        jcbEndpoint = new JComboBox<String>(endpoint);
        jcbEndpoint.setBounds(455, 40, 110, 40);
        jpTop.add(jcbEndpoint);

        //상단 패널에 위치시킬 JButton 
        JButton jbConfirm = new JButton("Confirm");
        jbConfirm.setBounds(470, 200, 80, 35);
        jbConfirm.addActionListener(new MyActionListener());
        jpTop.add(jbConfirm);
        
        JButton jbSetting = new JButton("Setting");
        jbSetting.setBounds(470, 250, 80, 35);
        jbSetting.addActionListener(new MyActionListener());
        jpTop.add(jbSetting);
        
        frame.setVisible(true);
        
    }



}
