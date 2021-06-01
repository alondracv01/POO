package util;

public class Tiempo {
	private int currentUpdate;
	
	public Tiempo() {
		this.currentUpdate=0;
	}
	
	public void setCurrentUpdate(int c) {
		this.currentUpdate=c;
	}
	
	public int getUpdatesFromSeconds(double seconds) {
		return (int) Math.round(seconds);
	}
	
	public void update() {
		currentUpdate++;
	}
	
	public String getFormatTime() {
		StringBuilder stringBuilder=new StringBuilder();
		int minutos=currentUpdate/60;
		int segundos=currentUpdate%60;
		
		if(minutos<10) {
			stringBuilder.append(0);
		}
		stringBuilder.append(minutos);
		stringBuilder.append(":");
		
		if(segundos<10) {
			stringBuilder.append(segundos);
		}
		stringBuilder.append(segundos);
		return stringBuilder.toString();
	}
	
	public boolean segundosDividibles(double segundos) {
		return currentUpdate%getUpdatesFromSeconds(segundos)==0;
	}
}
