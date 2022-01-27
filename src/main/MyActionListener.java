package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton button  = (JButton)ae.getSource();
        CurlMakerMain cmm = new CurlMakerMain();
        // 콤보박스의 값들을 가져온다.
        String platform = cmm.jcbPlatfrom.getSelectedItem().toString();
        String svc = cmm.jcbSvc.getSelectedItem().toString();
        String cmd = cmm.jcbCmd.getSelectedItem().toString();
        String endpoint = cmm.jcbEndpoint.getSelectedItem().toString();
        System.out.println("Platform : " + platform + " | " +"Service : " + svc + " | " + "Command : " + cmd + " | " +"Endpoint : " + endpoint);

        if ("Confirm".equals(button.getText())) {
            // jlb,jtf 초기화
            cmm.jlbVal1.setText("");
            cmm.jlbVal2.setText("");
            cmm.jlbVal3.setText("");
            cmm.jtfVal1.setVisible(false);
            cmm.jtfVal2.setVisible(false);
            cmm.jtfVal3.setVisible(false);
            cmm.jtfVal1.setText("");
            cmm.jtfVal2.setText("");
            cmm.jtfVal3.setText("");

            // 값을 받아 분류하여 TextArea 생성해주기
            classifyValues(svc, cmd);
        }//end if

        if ("Create C-Url".equals(button.getText())) {
            // JLabel과 JTextField 값을 체크 하여 JTextArea로 전달
            checkLabel(cmm.jlbVal1.getText(), cmm.jlbVal2.getText(), cmm.jlbVal3.getText(), svc, cmd, endpoint);
        }
        
    }//actionPerformed
    
    
    private void classifyValues(String svc, String cmd) {
        
        CurlMakerMain cmm = new CurlMakerMain();
        
        if ("Token(Admin)".equals(svc)) { } // No Input Args
        
        if ("Token(User)".equals(svc)) { // User Email, User Password
            
        }
        
        if ("users".equals(svc)) { // Create, List, List(UserId), Delete 
            if ("CREATE".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("JSON");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("LIST".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("LIST(ID)".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("ID1");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("DELETE".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("ID1");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else { // 오류팝업
                
            }//end else
        }//end if
        
        if ("servers".equals(svc)) { // Create, List, List(Detail), List(ServerId), Delete, Update, Start, Stop, Reboot  
            if ("CREATE".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("JSON");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("LIST".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("LIST(ID)".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("ID1");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("LIST(DETAIL)".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("DELETE".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("ID1");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("UPDATE".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("JSON");
                cmm.jtfVal2.setVisible(true);
                cmm.jlbVal3.setText("ID1");
                cmm.jtfVal3.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("START".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("ID1");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            } else if ("STOP".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("ID1");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            }else if ("REBOOT".equals(cmd)) {
                cmm.jlbVal1.setText("TOKEN");
                cmm.jtfVal1.setVisible(true);
                cmm.jlbVal2.setText("ID1");
                cmm.jtfVal2.setVisible(true);
                cmm.jbCreate.setVisible(true);
            }  else { // 오류팝업
                
            }//end else
        }
        
        if ("projects".equals(svc)) { // Create, List, List(ProjectId), Delete
            
        }
        
        if ("roles".equals(svc)) { // Create, List, List(RoleId), Delete
            
        }
        
        if ("flavors".equals(svc)) { // Create, List, List(FlavorId), Delete, Update
            
        }
        
        if ("os-keypairs".equals(svc)) { // Create, List, List(KeyName), Delete
            
        }
        
        if ("images".equals(svc)) { // Create, List, List(ImageId), Delete, Update, Deactivate, Reactivate
            
        }
        
        if ("volumes".equals(svc)) { // Create, List, List(VolumeId), Delete,
            
        }

        if ("vpc".equals(svc)) { // List, Delete
            
        }
        
        if ("Network".equals(svc)) { // Create, List, Delete
            
        }
        
        if ("Account".equals(svc)) { // Create, List, Delete,
            
        }
        
        if ("Firewall".equals(svc)) { //Create, List, Update, Delete
            
        }
        
        if ("IpAddress".equals(svc)) { // List, Associate, Disassociate
            
        }
        
        if ("Portforwarding".equals(svc)) { // Create, List, Delete
            
        }
        
        if ("StaticRoute".equals(svc)) { // Create, List, Delete
            
        }
        
        if ("StaticNat".equals(svc)) { // List, Enable, Disable
            
        }
        
        if ("ports".equals(svc)) { // List
            
        }
        
    }//classifyValues
    
    private void checkLabel(String jlb1, String jlb2, String jlb3, String svc, String cmd, String endpoint) {
        CurlMakerMain cmm = new CurlMakerMain();
        // 1. JLabel에 제목에 따라 값 넣어주기 (TOKEN, JSON, ID1, ID2)
        String token = "";
        String json = "";
        String id1 = "";
        String id2 = "";
        if (jlb1.equals("TOKEN")) {
            token = cmm.jtfVal1.getText();
        }
        
        if (jlb2.equals("JSON")) {
            json = cmm.jtfVal2.getText();
        } else if (jlb2.equals("ID1")) {
            id1 = cmm.jtfVal2.getText();
        }
        
        if (jlb3.equals("ID1")) {
            id1 = cmm.jtfVal3.getText();
        } else if (jlb3.equals("ID2")) {
            id2 = cmm.jtfVal3.getText();
        }
        
        // 2. 값들을 curlMaker로 전달
        String curl = curlMaker(token, json, id1, id2, svc, cmd, endpoint);
        cmm.jtaCurl.setText(curl);
    }//checkLabel
    
    
    private String curlMaker(String token, String json, String id1, String id2, String svc, String cmd, String endpoint) {
        CurlMakerMain cmm = new CurlMakerMain();
        StringBuilder sbCurlMaker = new StringBuilder();
        sbCurlMaker.append("curl -ki -X ");
        // 1. Command 파악하여 POST, GET, DELETE, UPDATE 등 구성
        if ("CREATE".equals(cmd) || "ATTACH".equals(cmd) || "START".equals(cmd) || "STOP".equals(cmd) 
            || "REBOOT".equals(cmd) || "ASSOCIATE".equals(cmd) || "DEACTIVATE".equals(cmd) || "REACTIVATE".equals(cmd) || "ENABLE".equals(cmd)) {
            sbCurlMaker.append("POST ");
        }

        if ("LIST".equals(cmd) || "LIST(ID)".equals(cmd) || "LIST(DETAIL)".equals(cmd)) {
            sbCurlMaker.append("GET ");
        }
        
        if ("DELETE".equals(cmd) || "DETACH".equals(cmd) || "DISASSOCIATE".equals(cmd) || "DISABLE".equals(cmd)) {
            sbCurlMaker.append("DELETE ");
        }
        
        if ("UPDATE".equals(cmd)) {
            if ("Image".equals(svc)) {
                sbCurlMaker.append("PATCH ");
            } else {
                sbCurlMaker.append("PUT ");
            }
        }
        sbCurlMaker.append("-H 'Content-Type:application/json' ");
        sbCurlMaker.append("'X-Auth-Token:");

        // 2. token 값이 있을 때 토큰 넣어주기
        if (!token.equals("") && token != null) {
            sbCurlMaker.append(token);
            sbCurlMaker.append("' ");
        }
        
        // 3. json 값이 있을 때 json 넣어주기
        if (!json.equals("") && json != null) {
            sbCurlMaker.append("-d '");
            sbCurlMaker.append(json);
            sbCurlMaker.append("' ");
        }

        // 4. endpoint가 local인지 stack인지 구분하여 호출 url 붙여주기
        if (endpoint.equals("Local")) {
            sbCurlMaker.append("'http://localhost:8080/openstack4kt");
            // 5. service 체크하여 stack명 부여
            if ("users".equals(svc) || "projects".equals(svc) || "roles".equals(svc)) { //keystone; token 생성은 별도로 할 예정
                sbCurlMaker.append("/keystone/v3");
            }

            if ("flavors".equals(svc) || "os-keypairs".equals(svc) || "servers".equals(svc)) { //nova
                sbCurlMaker.append("/nova/v2.1");
            }

            if ("volumes".equals(svc) && "ATTACH".equals(cmd)) { //ATTACH, DETACH Volume은 Server service라 nova
                sbCurlMaker.append("/nova/v2.1");
            } else if ("volumes".equals(svc) && "DETACH".equals(cmd)) {
                sbCurlMaker.append("/nova/v2.1");
            } 

            if ("volumes".equals(svc) || "snapshots".equals(svc)) { //cinder
                sbCurlMaker.append("/cinder/v3");
            }

            if ("images".equals(svc)) { //glance
                sbCurlMaker.append("/glance/v2");
            }

            if ("vpc".equals(svc) || "Network".equals(svc) || "Account".equals(svc) || "Firewall".equals(svc) || "IpAddress".equals(svc) 
                || "Portforwarding".equals(svc) || "StaticRoute".equals(svc)|| "StaticNat".equals(svc) || "ports".equals(svc)) { //NC
                sbCurlMaker.append("/nc/v1");
            }
        }//end if

        if (endpoint.equals("Stack")) {
            // 5. service 체크하여 stack Endpoint 부여
            if ("users".equals(svc) || "projects".equals(svc) || "roles".equals(svc)) { //keystone; token 생성은 별도로 할 예정
                sbCurlMaker.append("https://10.10.73.20:13000/v3");
            }

            if ("flavors".equals(svc) || "os-keypairs".equals(svc) || "servers".equals(svc)) { //nova
                sbCurlMaker.append("https://10.10.73.20:13774/v2.1");
            }

            if ("volumes".equals(svc) && "ATTACH".equals(cmd)) { //ATTACH, DETACH Volume은 Server service라 nova
                sbCurlMaker.append("https://10.10.73.20:13774/v2.1");
            } else if ("volumes".equals(svc) && "DETACH".equals(cmd)) {
                sbCurlMaker.append("https://10.10.73.20:13774/v2.1");
            } 

            if ("volumes".equals(svc) || "Snapshot".equals(svc)) { //cinder
                sbCurlMaker.append("https://10.10.73.20:13776/v3");
            }

            if ("images".equals(svc)) { //glance
                sbCurlMaker.append("https://10.10.73.20:13292/v2");
            }

            if ("vpc".equals(svc) || "Network".equals(svc) || "Account".equals(svc) || "Firewall".equals(svc) || "IpAddress".equals(svc) 
                || "Portforwarding".equals(svc) || "StaticRoute".equals(svc) || "StaticNat".equals(svc) || "ports".equals(svc)) { //NC
                sbCurlMaker.append("http://10.10.211.230:8080/client/api");
            }
        }//end if

        // 6. json 값이 있을 때 (create)
        if (!json.equals("") && json != null) {
            sbCurlMaker.append("/");
            sbCurlMaker.append(svc);
            sbCurlMaker.append("' ");
        }

        // 7. json 값이 있고 id1값도 있을 때 (update)
        if (!json.equals("") && json != null && !id1.equals("") && id1 != null) {
            sbCurlMaker.append("/");
            sbCurlMaker.append(svc);
            sbCurlMaker.append("/");
            sbCurlMaker.append(id1);
            sbCurlMaker.append("/");
            if ("servers".equals(svc)) {
                sbCurlMaker.append("action");
            }
            sbCurlMaker.append("' ");
        }

        // 7. json값이 없고 첫번째 id 값이 있으나 두번째 id 값이 없을 때
        if (json.equals("") && !id1.equals("") && id1 != null && id2.equals("")) {
            sbCurlMaker.append("/");
            sbCurlMaker.append(svc);
            sbCurlMaker.append("/");
            sbCurlMaker.append(id1);
            sbCurlMaker.append("' ");
        }

        // 8. json값이 없고 첫번째 id 값이 있고 두번째 id 값도 있을 때
        if (json.equals("") && !id1.equals("") && id1 != null && !id2.equals("") && id2 != null) {
            sbCurlMaker.append("/");
            sbCurlMaker.append(svc);
            sbCurlMaker.append("/");
            sbCurlMaker.append(id1);
            sbCurlMaker.append("' ");
        }
        
        System.out.println(sbCurlMaker.toString());
        return sbCurlMaker.toString();

    }//curlMaker
    
    
}
