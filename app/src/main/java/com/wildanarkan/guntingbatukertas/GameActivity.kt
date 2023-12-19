package com.wildanarkan.guntingbatukertas

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity

class GameActivity : ComponentActivity(){

    lateinit var computerImageView: ImageView
    lateinit var  rockButtonImage: ImageButton
    lateinit var  scissorsImageButton: ImageButton
    lateinit var paperImageButton: ImageButton
    lateinit var resultImageView: ImageView

    private fun initComponent(){
        computerImageView = findViewById(R.id.computerImageView)
        rockButtonImage = findViewById(R.id.rockImageButton)
        scissorsImageButton = findViewById(R.id.scissorsImageButton)
        paperImageButton = findViewById(R.id.paperImageButton)
        resultImageView = findViewById(R.id.resultImageView)
    }

    private fun initListener(){
        rockButtonImage.setOnClickListener {startGame("ROCK")  }
        scissorsImageButton.setOnClickListener {startGame("SCISSORS")  }
        paperImageButton.setOnClickListener {startGame("PAPER")  }
    }

    private fun startGame(option: String){
        val computerOption = Game.pickRandomOption()
        computerImageView.setImageResource(Game.pickDrawable(computerOption))

        when{
            Game.isDraw(option, computerOption) -> resultImageView.setImageResource(R.drawable.draw)
            Game.isWin(option, computerOption) -> resultImageView.setImageResource(R.drawable.win)
            else -> resultImageView.setImageResource(R.drawable.lose)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        initComponent()
        initListener()
    }
}