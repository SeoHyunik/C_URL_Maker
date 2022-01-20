package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton button  = (JButton)ae.getSource();
        if ("Confirm".equals(button.getText())) {
            // 1. 콤보박스의 값들을 가져온다.
            CurlMakerMain cmm = new CurlMakerMain();
            String platform = cmm.jcbPlatfrom.getSelectedItem().toString();
            String svc = cmm.jcbSvc.getSelectedItem().toString();
            String cmd = cmm.jcbCmd.getSelectedItem().toString();
            String endpoint = cmm.jcbEndpoint.getSelectedItem().toString();
            System.out.println("Platform : " + platform + " | " +"Service : " + svc + " | " + "Command : " + cmd + " | " +"Endpoint : " + endpoint);

            // 2. 값을 받아 분류한다.
            classifyPlatform(platform);
            classifySvc(svc);
            classifyCmd(cmd);
            classifyEndpoint(endpoint);
        }//end if
        
    }//actionPerformed

    private void classifyPlatform(String platform) {
        //현재까지 EPC, G-Cloud 구분은 의미 없음
        //같은 Curl로도 가능
    }
    
    private void classifySvc(String svc) {
        
        if ("Token".equals(svc)) {
            
        }

        if ("User".equals(svc)) {
            
        }

        if ("Server".equals(svc)) {
            
        }

        if ("Project".equals(svc)) {
            
        }

        if ("Role".equals(svc)) {
            
        }

        if ("Flavor".equals(svc)) {
            
        }

        if ("Keypair".equals(svc)) {
            
        }

        if ("ServerImage".equals(svc)) {
            
        }

        if ("Vpc".equals(svc)) {
            
        }

        if ("Network".equals(svc)) {
            
        }

        if ("Account".equals(svc)) {
            
        }

        if ("Firewall".equals(svc)) {
            
        }
        
        if ("IpAddress".equals(svc)) {
            
        }

        if ("PortforwardingRule".equals(svc)) {
            
        }
        
        if ("StaticRoute".equals(svc)) {
            
        }

        if ("StaticNat".equals(svc)) {
            
        }

        if ("Port".equals(svc)) {
            
        }
    
    }//classifySvc
    
    
    private void classifyCmd(String cmd) {
    }
    
    private void classifyEndpoint(String endpoint) {
    }   

}
