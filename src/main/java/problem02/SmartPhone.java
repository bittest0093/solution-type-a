package problem02;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute(String str) {
		Phone ph=new Phone();
		MusicPhone mp=new MusicPhone();
		if(str.equals("통화")) {
			ph.execute(str);
		}else if(str.equals("음악"))
		{
			mp.execute(str);
		}else {
			runApp();
		}
		
	}
	
	public String runApp() {
		System.out.println("앱실행");
		return null;
	}
}