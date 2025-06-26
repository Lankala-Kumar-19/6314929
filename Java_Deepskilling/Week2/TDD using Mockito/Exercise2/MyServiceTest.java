package mocktitoExercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)
class MyServiceTest {
	@Mock
	ExternalApi mockApi;
	
	

	@Test
	void testExternalApi() {
		when(mockApi.getData()).thenReturn("Mock API");
		MyService service=new MyService(mockApi);
		assertEquals("Mock API",service.fetchData());
		
		verify(mockApi).getData();
	}

}
