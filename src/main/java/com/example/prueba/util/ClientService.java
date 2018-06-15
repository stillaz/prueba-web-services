package com.example.prueba.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientService {

	public static InputStream get(String uri, String mediaContentType) throws IOException {
		URL url = new URL(uri);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-Type", mediaContentType);
		conn.disconnect();
		return conn.getInputStream();
	}
}
