package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton button  = (JButton)ae.getSource();
        if ("Confirm".equals(button.getText())) {
            // 1. Confirm 버튼이 눌렸는지 체크
            button.setText("체크"); 
            // 2. 콤보박스의 값들을 가져온다.
            CurlMakerMain cmm = new CurlMakerMain();

        }
        
    }
}
