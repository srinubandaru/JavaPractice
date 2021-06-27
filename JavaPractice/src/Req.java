import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Req {

	public static void main(String[] args) throws IOException {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("https://reqres.in/api/users?page=2")
		  .get()
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "308c9575-1317-1166-f4b1-f3a6270990a9")
		  .build();

		Response response = client.newCall(request).execute();

	}

}
