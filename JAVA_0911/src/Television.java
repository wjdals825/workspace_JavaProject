public class Television {
     int channel;
     int volume;
     boolean onOff;
     
	public static void main(String[] args) {
		Television tv= new Television();
		 tv.channel=7;
		 tv.volume=6;
		 tv.onOff=true;
          System.out.println("ä����"+tv.channel+"�̰� ������"+tv.volume+"�Դϴ�");
          
         Television yourTv=new Television();
         yourTv.channel=9;
         yourTv.volume=12;
         yourTv.onOff=true;
         System.out.println("�ڷ������� ä����"+yourTv.channel+"�̰� ������"+yourTv.volume+"�Դϴ�.");
	}

}
