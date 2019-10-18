package day09.instance;

public class Button_ex {
	public static void main(String args[]) {
		Button b = new Button();
		
		b.setOnClickListener(new CallListener());
		b.touch();
		b.setOnClickListener(new MessageListener());
		b.touch();
	}
}

class Button {
	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	interface OnClickListener {
		void onClick();
	}
}