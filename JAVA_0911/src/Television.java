public class Television {
     int channel;
     int volume;
     boolean onOff;
     
	public static void main(String[] args) {
		Television tv= new Television();
		 tv.channel=7;
		 tv.volume=6;
		 tv.onOff=true;
          System.out.println("채널은"+tv.channel+"이고 볼륨은"+tv.volume+"입니다");
          
         Television yourTv=new Television();
         yourTv.channel=9;
         yourTv.volume=12;
         yourTv.onOff=true;
         System.out.println("텔레비전의 채널은"+yourTv.channel+"이고 볼륨은"+yourTv.volume+"입니다.");
	}

}
