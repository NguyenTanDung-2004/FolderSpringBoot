package com.example.DoAn1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DoAn1.service.UserService;
import com.example.DoAn1.utils.UtilsHandleEmail;
import com.example.DoAn1.utils.UtilsHandleJwtToken;

@RestController
@RequestMapping("/test")
public class test {
    @Autowired
    private UtilsHandleJwtToken utilsHandleJwtToken;

    @Autowired
    private UserService userService;

    @Autowired
    private UtilsHandleEmail utilsHandleEmail;

    @PostMapping("/test")
    public ResponseEntity test(@RequestBody String jsonData) {
        System.out.println(jsonData);
        return null;
    }

    @PostMapping("/testAuthorization")
    public String abc() {
        System.out.println("nguyentandung");
        return "nguyentandung";
    }

    // Tính độ tương đồng cosine giữa hai vector
    public static double cosineSimilarity(double[] vectorA, double[] vectorB) {
        // Kiểm tra độ dài của hai vector có bằng nhau không
        if (vectorA.length != vectorB.length) {
            throw new IllegalArgumentException("Hai vector phải có cùng độ dài");
        }

        double dotProduct = 0.0; // Tích vô hướng A * B
        double normA = 0.0; // Độ dài của vector A
        double normB = 0.0; // Độ dài của vector B

        // Tính tích vô hướng và độ dài của các vector
        for (int i = 0; i < vectorA.length; i++) {
            dotProduct += vectorA[i] * vectorB[i];
            normA += Math.pow(vectorA[i], 2);
            normB += Math.pow(vectorB[i], 2);
        }

        // Tính giá trị độ tương đồng cosine
        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
    }

    public static void main(String[] args) {
        // Ví dụ hai vector đại diện cho các sản phẩm hoặc người dùng
        double[] vectorA = { 90 * 6, 130 * 6, 25.952 * 3, 125 * 5, 70 * 5, 50 * 4 };
        double[] vectorB = { 115.5 * 6, 160 * 6, 20 * 3, 90 * 5, 70 * 5, 75 * 4 };

        // Tính độ tương đồng cosine giữa hai vector
        double similarity = cosineSimilarity(vectorA, vectorB);
        System.out.println("Độ tương đồng cosine: " + similarity);
    }

}
