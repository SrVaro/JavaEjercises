package data;

public class BMPImage {

	private Pixel[][] pixelMatrix;

	public Pixel[][] getPixelMatrix() {
		return pixelMatrix;
	}

	public void setPixelMatrix(Pixel[][] pixelMatrix) {
		this.pixelMatrix = pixelMatrix;
	}

	public BMPImage(Pixel[][] pixelMatrix) {
		super();
		this.pixelMatrix = pixelMatrix;
	}

}
