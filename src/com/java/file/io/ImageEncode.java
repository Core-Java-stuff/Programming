package com.java.file.io;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageEncode {

	public static void main(String[] args) throws Exception {

		File imageFile = new File(
				"C:/Users/basanta.kumar.hota/Desktop/ApplicationDataHouse/certificates.png");
		String img = imageToBase64String(imageFile);

		System.out.println("Converted String " + img);
	}

	public static String imageToBase64String(File imageFile) throws Exception {

		String image = null;
		BufferedImage buffImage = ImageIO.read(imageFile);

		if (buffImage != null) {
			java.io.ByteArrayOutputStream os = new java.io.ByteArrayOutputStream();
			ImageIO.write(buffImage, "jpg", os);
			byte[] data = os.toByteArray();
			image = CustomBase64.encode(data);
		}
		return image;
	}
}
