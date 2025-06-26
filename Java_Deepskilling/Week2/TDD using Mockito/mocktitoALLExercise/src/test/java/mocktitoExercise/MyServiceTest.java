package mocktitoExercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)
class MyServiceTest {
	@Mock
	ExternalApi mockApi;
	
	@Mock
	DemoAPI demoApi;
	
	
	
	

	
	@Test
	
	void testExternalApi() {
		when(mockApi.getData()).thenReturn(new Data(1,"This is 1st line of data")).thenReturn(new Data(2,"Hi"));
		
		MyService service=new MyService(mockApi,demoApi);
		String x=service.fetchData();
		assertEquals("ID: 1	Description: This is 1st line of data",x);
		
		assertEquals("ID: 2	Description: Hi",service.fetchData());
		
		//assertEquals("ID: 3 Description: Im kumar",service.fetchData());
		
		
	
		
		
		verify(mockApi,times(2)).getData();
	}
	
	@Test
	
	void testFetchName() {
		MyService service=new MyService(mockApi,demoApi);
		
		Exception ex=assertThrows(Exception.class,()->{
			service.fetchName();
		});
		
		assertEquals("Void method",ex.getMessage());

		verify(demoApi).getName();
	}
	
	@Test
	void testInteractionOrder() {
		when(mockApi.getData()).thenReturn(new Data(1,"This is 1st line of data")).thenReturn(new Data(2,"Hi"));

	    MyService service = new MyService(mockApi, demoApi);

	    service.fetchData();
	    try {
	        service.fetchName();
	    } catch (Exception e) {}

	    InOrder inOrder = inOrder(mockApi, demoApi);
	    inOrder.verify(mockApi).getData();
	    inOrder.verify(demoApi).getName();
	}


}
