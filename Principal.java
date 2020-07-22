
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CelPhone pho=new CelPhone();
		pho.dialNumber();
		pho.isCallnProgress();
		
		LandlinePhone Ll=new LandlinePhone();
		Ll.dialNumber();
		Ll.isCallnProgress();
		
		VideoPhone vi=new VideoPhone();
		vi.dialNumber();
		vi.isCallnProgress();

	}

}
