package com.ckh.codingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    fun solution(s: String): Int {
        var answer = 0
        val minLength: ArrayList<Int> = arrayListOf<Int>()
        with(minLength) {
            add(split2(s).length)
            add(split3(s).length)
            add(split4(s).length)
            add(split6(s).length)
        }
        minLength.sorted()
        answer = minLength[0]

        return answer
    }


    private fun split2(s: String): String {
        val token = s.chunked(2)
        var cnt = 1
        val length = if(s.length%2 == 0) s.length/2 else (s.length/2) +1
        for (i in 0..length) {
            while (token[i] == token[i + 1]) {
                cnt += 1
                s.replace("${token[i + 1]}", "")
                s.replace("${token[i]}", "${cnt}${token[i]}")
            }
        }
        return s
    }

    private fun split3(s: String): String {
        val token = s.chunked(3)
        var cnt = 1
        val length = if(s.length%3 == 0) s.length/3 else (s.length/3) +1
        for (i in 0..length) {
            while (token[i] == token[i + 1]) {
                cnt += 1
                s.replace("${token[i + 1]}", "")
                s.replace("${token[i]}", "${cnt}${token[i]}")
            }
        }
        return s
    }
    private fun split4(s: String): String {
        val token = s.chunked(4)
        var cnt = 1
        val length = if(s.length%4 == 0) s.length/4 else (s.length/4) +1
        for (i in 0..length) {
            while (token[i] == token[i + 1]) {
                cnt += 1
                s.replace("${token[i + 1]}", "")
                s.replace("${token[i]}", "${cnt}${token[i]}")
            }
        }
        return s
    }
    private fun split6(s: String): String {
        val token = s.chunked(6)
        var cnt = 1
        val length = if(s.length%6 == 0) s.length/6 else (s.length/6) +1
        for (i in 0..length) {
            while (token[i] == token[i + 1]) {
                cnt += 1
                s.replace("${token[i + 1]}", "")
                s.replace("${token[i]}", "${cnt}${token[i]}")
            }
        }
        return s
    }
}



