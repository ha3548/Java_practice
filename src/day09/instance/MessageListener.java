package day09.instance;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
