package main;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CurlMakerMain {
    
    private static String platform[] = {"Service1", "Service2"};
    private static String svc[] = {"Token(Admin)", "Token(User)", "users", "servers", "projects", "roles", "flavors", "os-keypairs", 
                                    "volumes", "snapshots", "images", "vpc", "Network", 
                                    "Account", "Firewall", "IpAddress", "Portforwarding", "StaticRoute", 
                                    "StaticNat", "ports"};
    private static String cmd[] = {"CREATE", "DELETE", "UPDATE", "LIST", "LIST(ID)", "LIST(DETAIL)", "ATTACH", "DETACH", 
                                    "REACTIVATE", "DEACTIVATE", "ASSOCIATE", "DISASSOCIATE", "START", "STOP", "REBOOT", "ENABLE", "DISABLE"};
    private static String endpoint[] = {"Local", "Stack"};

    public static JPanel jpTop;
    public static JPanel jpMiddle;
    public static JPanel jpBottom;

    public static JComboBox jcbPlatfrom;
    public static JComboBox jcbSvc;
    public static JComboBox jcbCmd;
    public static JComboBox jcbEndpoint;

    public static JLabel jlbVal1;
    public static JLabel jlbVal2;
    public static JLabel jlbVal3;

    public static JLabel errJlb1;
    public static JLabel errJlb2;

    public static JTextField jtfVal1;
    public static JTextField jtfVal2;
    public static JTextField jtfVal3;

    public static JButton jbCreate;
    public static JLabel jlbCurl;
    public static JTextArea jtaCurl;
    public static JScrollPane jsp;
    
    public static void testGui() {
        JFrame frame = new JFrame("C-Url Maker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,150,620, 600);
        frame.setLayout(null);

        //화면 삼분할을 위한 JPanel 구성
        jpTop = new JPanel();
        jpTop.setBounds(0, 0, 620, 300);
        jpTop.setBackground(new Color(100, 0, 0, 100));
        jpTop.setLayout(null);

        jpMiddle = new JPanel();
        jpMiddle.setBounds(0, 300, 620, 180);
        jpMiddle.setBackground(new Color(0, 100, 0, 100));
        jpMiddle.setLayout(null);

        jpBottom = new JPanel();
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
        
        JButton jbSetting = new JButton("Json");
        jbSetting.setBounds(470, 250, 80, 35);
        jbSetting.addActionListener(new MyActionListener());
        jpTop.add(jbSetting);

        // C-Url 생성 버튼
        jbCreate = new JButton("Create C-Url");
        jbCreate.setBounds(35, 250, 130, 35);
        jbCreate.addActionListener(new MyActionListener());
        jbCreate.setVisible(false);
        jpTop.add(jbCreate);

        // 중단 패널에 위치시킬 JLabel
        jlbVal1 = new JLabel();
        jlbVal1.setBounds(35, 20, 80, 30);
        jpMiddle.add(jlbVal1);
        
        jlbVal2 = new JLabel();
        jlbVal2.setBounds(35, 70, 80, 30);
        jpMiddle.add(jlbVal2);
        
        jlbVal3 = new JLabel();
        jlbVal3.setBounds(35, 120, 80, 30);
        jpMiddle.add(jlbVal3);

        // 중단 패널에 위치시킬 오류 JLabel
        errJlb1 = new JLabel();
        errJlb1.setBounds(35, 20, 80, 30);
        jpMiddle.add(errJlb1);
        
        errJlb2 = new JLabel();
        errJlb2.setBounds(35, 70, 80, 30);
        jpMiddle.add(errJlb2);

        // 중단 패널에 위치시킬 JTextField
        jtfVal1 = new JTextField();
        jtfVal1.setBounds(100, 20, 450, 30);
        jtfVal1.setVisible(false);
        jpMiddle.add(jtfVal1);

        jtfVal2 = new JTextField();
        jtfVal2.setBounds(100, 70, 450, 30);
        jtfVal2.setVisible(false);
        jpMiddle.add(jtfVal2);

        jtfVal3 = new JTextField();
        jtfVal3.setBounds(100, 120, 450, 30);
        jtfVal3.setVisible(false);
        jpMiddle.add(jtfVal3);

        // 하단 패널에 위치시킬 JLabel, JTextArea
        jlbCurl = new JLabel("C-URL");
        jlbCurl.setBounds(35, 10, 80, 30);
        jlbCurl.setVisible(true);
        jpBottom.add(jlbCurl);
        
        jtaCurl = new JTextArea();
        jtaCurl.setLineWrap(true);
        jtaCurl.setEditable(false);
        jsp = new JScrollPane(jtaCurl);
        jsp.setBounds(100, 10, 450, 60);
        jsp.setVisible(true);
        jpBottom.add(jsp);
        
        frame.setVisible(true);
        
    }



}
