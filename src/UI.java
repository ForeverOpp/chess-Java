import javax.swing.*;

/*
 * 这里放置着许多关于UI的方法
 * 
 * */


public class UI {
	{
		//禁用皮肤自带按钮
		UIManager.put("RootPane.setupButtonVisible", false);
	}
	/*
	 * 登录窗口
	 * */
	public JFrame creatLoginFrame() throws Throwable {
		//创建变量
		JFrame jf = new JFrame("登录窗口");
		JButton loginB = new JButton("登录");
		JButton exitB = new JButton("退出");
		JTextField text1 = new JTextField("用户名",1);
		JPasswordField text2 = new JPasswordField("密码",1);
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createVerticalBox();
		Box box3 = Box.createVerticalBox();
		JMenuBar loginBar = new JMenuBar();
		JMenu setting = new JMenu("选项");
		JMenuItem about = new JMenuItem("关于");
		JMenuItem exit = new JMenuItem("退出");
		
		//处理菜单
		setting.add(about);
		setting.add(exit);
		loginBar.add(setting);
		jf.setJMenuBar(loginBar);

		//布局
		box1.add(loginB);
		box1.add(Box.createHorizontalGlue());
		box1.add(exitB);
		box2.add(text1);
		box2.add(text2);
		box3.add(box2);
		box3.add(box1);
		
		//事件监听
		loginB.addActionListener((e) -> {
			;
		});
		exitB.addActionListener((e) -> {
			System.exit(0);
		});
		
		//窗口设置
		jf.setSize(500,200);	//大小
		jf.setLocationRelativeTo(null);	//居中
		jf.add(box3);	//加入盒子布局
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//设置“X”键的作用为关闭
		jf.setResizable(false);	//设置禁止缩放
		jf.setVisible(true);	//设置窗口可见
		return jf;
	}
}
