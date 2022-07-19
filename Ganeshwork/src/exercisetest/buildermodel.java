package exercisetest;


public class buildermodel {
      public static void main(String[] args) {
    	  Mobileshop comp=new  Mobileshop .Mobilebuilder("23gb", "34gb").setGraphic(true).setBluetooth(true).nmbuild();

          System.out.println(comp.getVivo());
          System.out.println(comp.getRealme());
          System.out.println(comp.isScreengraphicmode());
          System.out.println(comp.isBluetoothmode());
      }
	}

 class  Mobileshop {
	 private String vivo ;
	 
	private String  realme ;
	 private boolean screengraphicmode;
	 private  boolean bluetoothmode;
	

public String getVivo() {
	return vivo;
}
public String getRealme() {
	return realme;
}


public boolean isScreengraphicmode() {
	return screengraphicmode;
}

public boolean isBluetoothmode() {
	return bluetoothmode;
}


 
private  Mobileshop(Mobilebuilder tnagar ) {
	 this.vivo =tnagar.vivo;
	 this.realme =tnagar.realme;
	 this.screengraphicmode=tnagar.screengraphicmode;
	 this.bluetoothmode=tnagar.bluetoothmode;
 } 
  public  static class Mobilebuilder{
	  private String vivo ;
		 
		private String  realme ;
		 private boolean screengraphicmode;
		 private  boolean bluetoothmode;	  
		 
		 
			public  Mobilebuilder(String vivo, String realme){
				this.vivo=vivo;
				this.realme=realme;
			}
			
			public Mobilebuilder setGraphic(boolean screengraphicmode) { 
				this.screengraphicmode = screengraphicmode;
				return this;
			}
			public Mobilebuilder setBluetooth(boolean bluetoothmode) {
				this.bluetoothmode = bluetoothmode;
				return this;
			}
			
			public Mobileshop nmbuild(){
				return new Mobileshop (this);
			}
		}
	}

