package com.example.myapplication7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding:ActivityMainBinding? = null
    private val binding get() =mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {// 뷰에 접근할수있음
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)// inflate(layoutInflater) 같이 써준다
        //바인딩 클래스 이름은 규칙이 정해져있다
        //Binding class 이름 ActivityMainBinding = MainActivity Activity 이름
        setContentView(binding.root)// .root 로 진입
        binding.tvMessage.setText("안녕하세요 김병성입니다.")
    }
    override fun onDestroy(){
        mBinding = null
        // 컴파일 시 오류 가 생길수있어 null 로 변경
        super.onDestroy()
    }
}