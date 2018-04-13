package messages;

public class Message {

	private String text;
	private String name;
	
	public Message(){
		
	}
	
	public Message(String text, String name){
		this.text = text;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "\nMessage [text=" + text +", name=" + name + "]";
	}

}
