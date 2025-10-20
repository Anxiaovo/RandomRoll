import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    ///
    /// @author AnXiaovo
    /// @date 2025-10-20
    /// @description 随机抽取[1-46]之间的一个数并输出
    ///
    public static void main(String[] args) {
        JFrame frame = new JFrame("[1-46]随机同学抽取程序");
        frame.setSize(555, 188);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("天道好轮回，苍天绕过谁？");
        label.setFont(new Font("黑体",Font.BOLD,40));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label);
        JButton Button = new JButton("抽取");
        Button.setPreferredSize(new Dimension(166,66));
        frame.add(Button);
        Button.addActionListener(e -> label.setText(GetNumber()));
        frame.setVisible(true);
    }
    private static String GetNumber(){
        Random random = new Random();
        int RandomNumber = random.nextInt(46) + 1;
        return "恭喜 " + RandomNumber + "号 同学被抽中！";
    }
}
