package com.example.quiz
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.contentValuesOf
import com.example.quiz.databinding.ActivityFlagsQuizBinding
import kotlin.random.Random

var correctButtonNumber: Int? = null
var counter=0
var mistakesNumber=0


class FlagsQuiz : AppCompatActivity() {
    private lateinit var binding: ActivityFlagsQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityFlagsQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nums = arrayOf<Int>(0,1,2,3,4,5,6,7,8,9,10,11)
        val countries = arrayOf<String>("ar" ,"au" ,"br" ,"ca" ,"cz" ,"de" ,"es" ,"fr" ,"no" ,"pl" ,"se" ,"us")
        val len=countries.size
        nums.shuffle()
        var correct: String? = null
        var correct_num = Random.nextInt(6)
        var lastCorrect: String? = null

        correct = chooseCorrect(nums[correct_num])
        binding.tvCorrect.text=correct
        lastCorrect=correct

        //first display

        drawFlag(1, nums[0], nums[correct_num])
        drawFlag(2, nums[1], nums[correct_num])
        drawFlag(3, nums[2], nums[correct_num])
        drawFlag(4, nums[3], nums[correct_num])
        drawFlag(5, nums[4], nums[correct_num])
        drawFlag(6, nums[5], nums[correct_num])



        binding.btnBack.setOnClickListener{
            finish()
            counter=0
            mistakesNumber=0
        }

        binding.imageButton1.setOnClickListener {
            if (correctButtonNumber == 1) {
                counter++
                nums.shuffle()
                correct_num = Random.nextInt(6)
                //not the same solution twice a row
                while (correct == lastCorrect) {
                    correct_num = Random.nextInt(6)
                    correct = chooseCorrect(nums[correct_num])
                }
                lastCorrect = correct
                binding.tvCorrect.text = correct
                drawFlag(1, nums[0], nums[correct_num])
                drawFlag(2, nums[1], nums[correct_num])
                drawFlag(3, nums[2], nums[correct_num])
                drawFlag(4, nums[3], nums[correct_num])
                drawFlag(5, nums[4], nums[correct_num])
                drawFlag(6, nums[5], nums[correct_num])
            }else{
                mistakesNumber++
            }
            binding.tvScore.text=counter.toString()
            binding.tvMistakes.text= mistakesNumber.toString()
        }
        binding.imageButton2.setOnClickListener {
            if (correctButtonNumber == 2) {
                counter++
                nums.shuffle()
                correct_num = Random.nextInt(6)
                //not the same solution twice a row
                while (correct == lastCorrect) {
                    correct_num = Random.nextInt(6)
                    correct = chooseCorrect(nums[correct_num])
                }
                lastCorrect = correct
                binding.tvCorrect.text = correct
                drawFlag(1, nums[0], nums[correct_num])
                drawFlag(2, nums[1], nums[correct_num])
                drawFlag(3, nums[2], nums[correct_num])
                drawFlag(4, nums[3], nums[correct_num])
                drawFlag(5, nums[4], nums[correct_num])
                drawFlag(6, nums[5], nums[correct_num])
            }else{
                mistakesNumber++
            }
            binding.tvScore.text=counter.toString()
            binding.tvMistakes.text= mistakesNumber.toString()

        }
        binding.imageButton3.setOnClickListener {
            if (correctButtonNumber == 3) {
                counter++
                nums.shuffle()
                correct_num = Random.nextInt(6)
                //not the same solution twice a row
                while (correct == lastCorrect) {
                    correct_num = Random.nextInt(6)
                    correct = chooseCorrect(nums[correct_num])
                }
                lastCorrect = correct
                binding.tvCorrect.text = correct
                drawFlag(1, nums[0], nums[correct_num])
                drawFlag(2, nums[1], nums[correct_num])
                drawFlag(3, nums[2], nums[correct_num])
                drawFlag(4, nums[3], nums[correct_num])
                drawFlag(5, nums[4], nums[correct_num])
                drawFlag(6, nums[5], nums[correct_num])
            }else{
                mistakesNumber++
            }
            binding.tvScore.text=counter.toString()
            binding.tvMistakes.text= mistakesNumber.toString()

        }
        binding.imageButton4.setOnClickListener {
            if (correctButtonNumber == 4) {
                counter++
                nums.shuffle()
                correct_num = Random.nextInt(6)
                //not the same solution twice a row
                while (correct == lastCorrect) {
                    correct_num = Random.nextInt(6)
                    correct = chooseCorrect(nums[correct_num])
                }
                lastCorrect = correct
                binding.tvCorrect.text = correct
                drawFlag(1, nums[0], nums[correct_num])
                drawFlag(2, nums[1], nums[correct_num])
                drawFlag(3, nums[2], nums[correct_num])
                drawFlag(4, nums[3], nums[correct_num])
                drawFlag(5, nums[4], nums[correct_num])
                drawFlag(6, nums[5], nums[correct_num])
            }else{
                mistakesNumber++
            }
            binding.tvScore.text=counter.toString()
            binding.tvMistakes.text= mistakesNumber.toString()

        }

        binding.imageButton5.setOnClickListener {
            if (correctButtonNumber == 5) {
                counter++
                nums.shuffle()
                correct_num = Random.nextInt(6)
                //not the same solution twice a row
                while (correct == lastCorrect) {
                    correct_num = Random.nextInt(6)
                    correct = chooseCorrect(nums[correct_num])
                }
                lastCorrect = correct
                binding.tvCorrect.text = correct
                drawFlag(1, nums[0], nums[correct_num])
                drawFlag(2, nums[1], nums[correct_num])
                drawFlag(3, nums[2], nums[correct_num])
                drawFlag(4, nums[3], nums[correct_num])
                drawFlag(5, nums[4], nums[correct_num])
                drawFlag(6, nums[5], nums[correct_num])
            }else{
                mistakesNumber++
            }
            binding.tvScore.text=counter.toString()
            binding.tvMistakes.text= mistakesNumber.toString()

        }
        binding.imageButton6.setOnClickListener {
            if (correctButtonNumber == 6) {
                counter++
                nums.shuffle()
                correct_num = Random.nextInt(6)
                //not the same solution twice a row
                while (correct == lastCorrect) {
                    correct_num = Random.nextInt(6)
                    correct = chooseCorrect(nums[correct_num])
                }
                lastCorrect = correct
                binding.tvCorrect.text = correct
                drawFlag(1, nums[0], nums[correct_num])
                drawFlag(2, nums[1], nums[correct_num])
                drawFlag(3, nums[2], nums[correct_num])
                drawFlag(4, nums[3], nums[correct_num])
                drawFlag(5, nums[4], nums[correct_num])
                drawFlag(6, nums[5], nums[correct_num])
            }else{
                mistakesNumber++
            }
            binding.tvScore.text=counter.toString()
            binding.tvMistakes.text= mistakesNumber.toString()

        }

                    binding.btnRefresh.setOnClickListener {
                        nums.shuffle()
                        correct_num = Random.nextInt(6)
                        //not the same solution twice a row
                        while (correct == lastCorrect) {
                            correct_num = Random.nextInt(6)
                            correct = chooseCorrect(nums[correct_num])
                        }
                        lastCorrect = correct
                        binding.tvCorrect.text = correct
                        drawFlag(1, nums[0], nums[correct_num])
                        drawFlag(2, nums[1], nums[correct_num])
                        drawFlag(3, nums[2], nums[correct_num])
                        drawFlag(4, nums[3], nums[correct_num])
                        drawFlag(5, nums[4], nums[correct_num])
                        drawFlag(6, nums[5], nums[correct_num])

                    }
                }

                fun drawFlag(but: Int, num: Int, cor: Int) {

                    if (num == cor) {
                        correctButtonNumber = but
                    }
                    when (but) {
                        1 -> {
                            when (num) {
                                0 -> binding.imageButton1.setImageResource(R.drawable.ar)
                                1 -> binding.imageButton1.setImageResource(R.drawable.au)
                                2 -> binding.imageButton1.setImageResource(R.drawable.br)
                                3 -> binding.imageButton1.setImageResource(R.drawable.ca)
                                4 -> binding.imageButton1.setImageResource(R.drawable.cz)
                                5 -> binding.imageButton1.setImageResource(R.drawable.de)
                                6 -> binding.imageButton1.setImageResource(R.drawable.es)
                                7 -> binding.imageButton1.setImageResource(R.drawable.fr)
                                8 -> binding.imageButton1.setImageResource(R.drawable.no)
                                9 -> binding.imageButton1.setImageResource(R.drawable.pl)
                                10 -> binding.imageButton1.setImageResource(R.drawable.se)
                                11 -> binding.imageButton1.setImageResource(R.drawable.us)
                            }
                        }
                        2 -> {
                            when (num) {
                                0 -> binding.imageButton2.setImageResource(R.drawable.ar)
                                1 -> binding.imageButton2.setImageResource(R.drawable.au)
                                2 -> binding.imageButton2.setImageResource(R.drawable.br)
                                3 -> binding.imageButton2.setImageResource(R.drawable.ca)
                                4 -> binding.imageButton2.setImageResource(R.drawable.cz)
                                5 -> binding.imageButton2.setImageResource(R.drawable.de)
                                6 -> binding.imageButton2.setImageResource(R.drawable.es)
                                7 -> binding.imageButton2.setImageResource(R.drawable.fr)
                                8 -> binding.imageButton2.setImageResource(R.drawable.no)
                                9 -> binding.imageButton2.setImageResource(R.drawable.pl)
                                10 -> binding.imageButton2.setImageResource(R.drawable.se)
                                11 -> binding.imageButton2.setImageResource(R.drawable.us)
                            }
                        }
                        3 -> {
                            when (num) {
                                0 -> binding.imageButton3.setImageResource(R.drawable.ar)
                                1 -> binding.imageButton3.setImageResource(R.drawable.au)
                                2 -> binding.imageButton3.setImageResource(R.drawable.br)
                                3 -> binding.imageButton3.setImageResource(R.drawable.ca)
                                4 -> binding.imageButton3.setImageResource(R.drawable.cz)
                                5 -> binding.imageButton3.setImageResource(R.drawable.de)
                                6 -> binding.imageButton3.setImageResource(R.drawable.es)
                                7 -> binding.imageButton3.setImageResource(R.drawable.fr)
                                8 -> binding.imageButton3.setImageResource(R.drawable.no)
                                9 -> binding.imageButton3.setImageResource(R.drawable.pl)
                                10 -> binding.imageButton3.setImageResource(R.drawable.se)
                                11 -> binding.imageButton3.setImageResource(R.drawable.us)
                            }
                        }
                        4 -> {
                            when (num) {
                                0 -> binding.imageButton4.setImageResource(R.drawable.ar)
                                1 -> binding.imageButton4.setImageResource(R.drawable.au)
                                2 -> binding.imageButton4.setImageResource(R.drawable.br)
                                3 -> binding.imageButton4.setImageResource(R.drawable.ca)
                                4 -> binding.imageButton4.setImageResource(R.drawable.cz)
                                5 -> binding.imageButton4.setImageResource(R.drawable.de)
                                6 -> binding.imageButton4.setImageResource(R.drawable.es)
                                7 -> binding.imageButton4.setImageResource(R.drawable.fr)
                                8 -> binding.imageButton4.setImageResource(R.drawable.no)
                                9 -> binding.imageButton4.setImageResource(R.drawable.pl)
                                10 -> binding.imageButton4.setImageResource(R.drawable.se)
                                11 -> binding.imageButton4.setImageResource(R.drawable.us)
                            }
                        }
                        5 -> {
                            when (num) {
                                0 -> binding.imageButton5.setImageResource(R.drawable.ar)
                                1 -> binding.imageButton5.setImageResource(R.drawable.au)
                                2 -> binding.imageButton5.setImageResource(R.drawable.br)
                                3 -> binding.imageButton5.setImageResource(R.drawable.ca)
                                4 -> binding.imageButton5.setImageResource(R.drawable.cz)
                                5 -> binding.imageButton5.setImageResource(R.drawable.de)
                                6 -> binding.imageButton5.setImageResource(R.drawable.es)
                                7 -> binding.imageButton5.setImageResource(R.drawable.fr)
                                8 -> binding.imageButton5.setImageResource(R.drawable.no)
                                9 -> binding.imageButton5.setImageResource(R.drawable.pl)
                                10 -> binding.imageButton5.setImageResource(R.drawable.se)
                                11 -> binding.imageButton5.setImageResource(R.drawable.us)
                            }
                        }
                        6 -> {
                            when (num) {
                                0 -> binding.imageButton6.setImageResource(R.drawable.ar)
                                1 -> binding.imageButton6.setImageResource(R.drawable.au)
                                2 -> binding.imageButton6.setImageResource(R.drawable.br)
                                3 -> binding.imageButton6.setImageResource(R.drawable.ca)
                                4 -> binding.imageButton6.setImageResource(R.drawable.cz)
                                5 -> binding.imageButton6.setImageResource(R.drawable.de)
                                6 -> binding.imageButton6.setImageResource(R.drawable.es)
                                7 -> binding.imageButton6.setImageResource(R.drawable.fr)
                                8 -> binding.imageButton6.setImageResource(R.drawable.no)
                                9 -> binding.imageButton6.setImageResource(R.drawable.pl)
                                10 -> binding.imageButton6.setImageResource(R.drawable.se)
                                11 -> binding.imageButton6.setImageResource(R.drawable.us)
                            }
                        }
                    }
                }

                //find correct text
                fun chooseCorrect(i: Int): String? {
                    var txt: String? = null
                    when (i) {
                        0 -> txt = getString(R.string.ar)
                        1 -> txt = getString(R.string.au)
                        2 -> txt = getString(R.string.br)
                        3 -> txt = getString(R.string.ca)
                        4 -> txt = getString(R.string.cz)
                        5 -> txt = getString(R.string.de)
                        6 -> txt = getString(R.string.es)
                        7 -> txt = getString(R.string.fr)
                        8 -> txt = getString(R.string.no)
                        9 -> txt = getString(R.string.pl)
                        10 -> txt = getString(R.string.se)
                        11 -> txt = getString(R.string.us)


                    }
                    return txt
                }
            }
