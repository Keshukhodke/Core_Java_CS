package Switch_Cases_25_08_25;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class QRCodeGenerator {

    public static void generateQRCode(String data, String path, int width, int height)
            throws WriterException, IOException {

        Map<EncodeHintType, ErrorCorrectionLevel> hints = new HashMap<>();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        BitMatrix bitMatrix = new MultiFormatWriter().encode(
                data, BarcodeFormat.QR_CODE, width, height, hints);

        MatrixToImageWriter.writeToPath(bitMatrix, path.substring(path.lastIndexOf('.') + 1),
                new File(path).toPath());

        System.out.println("QR Code generated at: " + path);
    }

    public static void main(String[] args) {
        try {
            // The payment info or URL encoded in the QR
            String paymentData = "upi://pay?pa=merchant@bank&pn=MerchantName&am=100.00&cu=INR";
            String filePath = "paymentQRCode.png";

            generateQRCode(paymentData, filePath, 250, 250);
        } catch (WriterException | IOException e) {
            System.out.println("Error generating QR code: " + e.getMessage());
        }
    }
}
