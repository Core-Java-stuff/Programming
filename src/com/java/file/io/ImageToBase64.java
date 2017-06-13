package com.java.file.io;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;

public class ImageToBase64 {

	private static String encodeFileToBase64Binary(File file) {
		String encodedfile = null;
		try {
			try (FileInputStream fileInputStreamReader = new FileInputStream(
					file);) {
				byte[] bytes = new byte[(int) file.length()];
				fileInputStreamReader.read(bytes);
				encodedfile = new String(Base64.encodeBase64(bytes), "UTF-8");
			}
		} catch (IOException e) {
		}
		return encodedfile;
	}

	public static void decodeBase64ToBinaryImage(File file) throws IOException {
		String encodeText = encodeFileToBase64Binary(file);
		byte[] decodedBytes = Base64.decodeBase64(encodeText.getBytes());
		String uploadFile = "C:/Users/basanta.kumar.hota/Desktop/test/test.png";
		BufferedImage image = ImageIO.read(new ByteArrayInputStream(
				decodedBytes));
		if (image == null) {
			System.out.println("Image can't be null");
		}
		File f = new File(uploadFile);
		// write the image
		ImageIO.write(image, "png", f);
		System.out.println("Uploaded in path :" + uploadFile);
	}

	public static void main(String[] args) throws IOException {
		File f = new File(
				"C:/Users/basanta.kumar.hota/Desktop/ApplicationDataHouse/certificates.png");
		decodeBase64ToBinaryImage(f);

	}

}
