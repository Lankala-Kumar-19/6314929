package mocktitoExercise;

public class MyService {
	ExternalApi api;
	DemoAPI demoApi;
	
	public MyService(ExternalApi api,DemoAPI demoApi) {
		this.api=api;
		this.demoApi=demoApi;
	}
	
	public String fetchData() {
		Data data=api.getData();
		return data.toString();
	}
	public void fetchName() throws Exception {
		demoApi.getName();
		throw new Exception("Void method");
		
	}
}
