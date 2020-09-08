package csdn.stx.cn;
//ÎÄÕÂÀà
public class Title {
	
	int num;
	String head;
	String body;
	String date;
	public Title() {}
	public Title(int num,String head,String body,String date) {
		this.num=num;
		this.head=head;
		this.body=body;
		this.date=date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
}
