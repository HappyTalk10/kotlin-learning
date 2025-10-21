package com.learning
fun main() {
    val num = 123
    
    println("10進数: $num")
    
    // toStringメソッドで基数を指定
    val binary = num.toString(2)
    val octal = num.toString(8)
    val hex = num.toString(16)
    
    println("2進数:  $binary")
    println("8進数:  $octal")
    println("16進数: $hex")
    println("16進数: ${hex.uppercase()}") // 大文字
    
    // 別の方法：Integer.toStringを使用
    println("\n別の方法:")
    println("2進数:  ${Integer.toBinaryString(num)}")
    println("8進数:  ${Integer.toOctalString(num)}")
    println("16進数: ${Integer.toHexString(num)}")
}