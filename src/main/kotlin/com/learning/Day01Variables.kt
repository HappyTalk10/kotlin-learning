package com.learning

fun main() {
    println("=== Day 1: 変数の基礎 ===\n")
    
    // 基本情報
    val myName = "田中太郎"
    var myAge = 25
    val myHobby = "プログラミング"
    
    //  新しい変数を追加
    val favoriteFood = "ラーメン"
    val favoriteDrink = "コーヒー"
    val birthPlace = "三重"
    var currentJob = "学生"
    val dreamJob = "エンジニア"
    
    // 数値の変数も追加
    val programmingExperience = 0  // プログラミング経験（年数）
    val dailyStudyHours = 2.5      // 1日の学習時間
    
    // Boolean（真偽値）の変数
    val hasLaptop = true
    val isWorking = false
    
    println("=== 詳細プロフィール ===")
    println("名前: $myName")
    println("年齢: ${myAge}歳")
    println("出身: $birthPlace")
    println("趣味: $myHobby")
    println("\n=== 好きなもの ===")
    println("好きな食べ物: $favoriteFood")
    println("好きな飲み物: $favoriteDrink")
    
    println("\n=== キャリア ===")
    println("現在の職業: $currentJob")
    println("夢の職業: $dreamJob")
    println("プログラミング経験: ${programmingExperience}年")
    
    println("\n=== 学習状況 ===")
    println("1日の学習時間: ${dailyStudyHours}時間")
    println("ノートPC所有: $hasLaptop")
    println("就業中: $isWorking")
    
    //  変数を使った計算
    val yearlyStudyHours = dailyStudyHours * 365
    println("\n年間学習時間: ${yearlyStudyHours}時間")
    
    // var変数を更新してみる
    println("\n=== 1年後の予想 ===")
    myAge += 1
    currentJob = "ジュニアエンジニア"
    println("年齢: ${myAge}歳")
    println("職業: $currentJob")
}
