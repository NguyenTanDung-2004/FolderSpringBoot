package com.example.DoAn1.request;

import java.util.List;

public class FoodCreationRequest {
    private int level; // 1: hard, 2: medium, 3: easy
    private int method;
    // 1: nước uống, 2: xào, 3 - rang, 4 - nướng, 5 - canh
    // 6 - kho, 7 - hấp, 8 - hầm, 9 - chiên dầu
    private int diet;
    // 1 - ít tinh bột, 2 - ít chất béo, 3 - nhiều đạm
    // 4 - thuần chay, 5 - ăn chay (trứng, sữa), 6 - Healthy
    // 7 - bình thường
    private double calories;
    private double time;
    private int type;
    // 1 - món chính, 2 - món phụ, 3 - món ăn vặt
    // 4 - món ăn sáng.
    private List<String> listIngredient;
    private List<String> listWeightIngredient;
    private List<String> listCaloriesIngredient;
    private List<String> listStep;
    private List<String> listLinkImage;
    private String linkVideo;
    private double carb;
    private double protein;
    private double fat;
    private int flagBloodPressure; // 1 hạn chế, 0
    private int flagBloodGlucose; // 1 hạn chế, 0
    private int flagHeart; // 1 hạn chế, 0
}
