package com.example.student.myapp

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook jika diklik akan menampilkan halaman facebook.com
        button4.setOnClickListener({
           val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/langitinspirasi"))
                    startActivity(i)
        })

        //button instagram jika diklik akan menampilkan halaman instagram.com
        button3.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/langitinspirasi.co.id"))
                    startActivity(i)
        })

        //Mendeklarasikan variabel MediaPlayer dan memanggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.a)
        //button yang berfungsi untuk memutar mp3
        btnPlay.setOnClickListener{
            MediaPlayer?.start()
        }
        //button yang berfungsi untuk melakukan pause mp3
        btnPause.setOnClickListener{
            MediaPlayer?.pause()
        }
        //button yang berfungsi untuk melakukan stop mp3
        btnStop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
