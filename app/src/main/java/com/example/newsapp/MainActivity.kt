package com.example.newsapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var myRecycleView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.hide()

        val ImgArray= arrayOf(
            R.drawable.tumblr_9f0310af8f75b2a57c532d89a2c4e211_66cb21a4_1280,
            R.drawable.gojo ,
            R.drawable.download ,
            R.drawable.aoi_todo ,
            R.drawable.itadori ,
            R.drawable.maki ,
            R.drawable.megumi ,
            R.drawable.sukuna ,
            R.drawable.yuta,
            R.drawable.tumblr_9f0310af8f75b2a57c532d89a2c4e211_66cb21a4_1280,
            R.drawable.gojo ,
            R.drawable.download ,
            R.drawable.aoi_todo ,
            R.drawable.itadori ,
            R.drawable.maki ,
            R.drawable.megumi ,
            R.drawable.sukuna ,
            R.drawable.yuta,
        )
        val ParaArray= arrayOf(
            "Strongest Under The Sky",
            "Biggest Fraud Ever",
            "Best Parenting Ever",
            "Simp but Strong",
            "Most Ignored Protagonist Ever",
            "Strong Independent Women",
            "Silver Spoon in Ass",
            "Now This is Overpowered",
            "Overhyped ",
            "Strongest Under The Sky",
            "Biggest Fraud Ever",
            "Best Parenting Ever",
            "Simp but Strong",
            "Most Ignored Protagonist Ever",
            "Strong Independent Women",
            "Silver Spoon in Ass",
            "Now This is Overpowered",
            "Overhyped "
        )
        val DesciArray= arrayOf(
            "Master Weapons Specialist: The Sorcerer Killer is capable of employing a wide variety of weapons in battle. His entire fighting style is based around using weapons to substitute for jujutsu. He keeps a vast arsenal in his cursed spirit, allowing him to efficiently switch weapons out based on necessity.\n" +
                    "\n" +
                    "Toji has used non-cursed tools such as swords to perform a sneak attack, so no cursed energy will be detected. Armed with a normal handgun, he's also an expert marksmen with extremely precise aim. The Sorcerer Killer can counter jujutsu users because he is also a master of wielding cursed tools. He's used a cursed tool broadsword to counter and slice open giant cursed spirits.[32][33] Toji has employed knives and daggers, sometimes one in each hand.[34] Additionally he employs his special grade cursed tool: The Inverted Spear of Heaven with a mastery worthy of that ranking. He could capitalize on the dagger's powerful nullification technique to negate even the most powerful sorcerer's abilities.\n" +
                    "\n" +
                    "Toji successfully complements his physical gifts with high adaptability and dexterity with all his weapons. By attaching a chain to the Inverted Spear of Heaven, Toji changed his entire fighting style to suit a long ranged battle.[35] When he first confronted Dagon, Toji took Playful Cloud, a weapon that Megumi stated was difficult to use, from Maki and used it to its maximum potential.[36]\n" +
                    "\n" +
                    "Enhanced Senses: Thanks to his Heavenly Restriction, Toji's lack of cursed energy resulted in his five senses being heightened to their absolute peak. He was able to see curses and jujutsu with just his elevated senses and even developed a resistance to them.[25] This also allowed Toji to track sorcerers without the use of residuals, as he was able to follow human footprints and odors.[37]\n" +
                    "\n" +
                    "Immense Strength: Toji possesses a superhuman degree of physical strength, enough so to effortlessly yank Playful Cloud from Maki's hands, another person with great physical gifts.[38] Using Playful Cloud, a tool that depends on physical strength, Toji was able to easily smash through Dagon's hardest shikigami.[39] With another cursed tool, he was able to cut through Suguru's toughest curse,[40] and used his bare hands to beat Takuma Ino's face so badly he almost died.[27]",

                    "Satoru Gojo is a fictional character and sorcerer from Gege Akutami's manga Jujutsu Kaisen. He is a teacher at Tokyo Prefectural Jujutsu High School and is considered one of the most dangerous people alive. He is also known as the strongest Jujutsu Sorcerer in the series. Gojo has many powers and abilities, including:\n" +
                            "Immense cursed energy\n" +
                            "Six Eyes\n" +
                            "Limitless\n" +
                            "Infinity\n" +
                            "Cursed Technique Lapse: Blue\n" +
                            "Cursed Technique Lapse Maximum Cursed Energy Output: Blue\n" +
                            "Cursed Technique Reversal: Red\n" +
                            "Blue Sphere\n" +
                            "Domain Expansion: Unlimited Void",
            "Megumi Fushiguro and Toji Fushiguro are characters in the Jujutsu Kaisen series who have a complicated relationship. Toji is Megumi's father, and Megumi fights Toji outside Shibuya Station on October 31, 2018. Toji is cruel and callous, but he cares about Megumi and wants him to have a better life. However, Toji abandons Megumi, and some say his character arc is tragic because he didn't break the Zenins' cycle of abuse. Megumi may become callous like his father, but the influence of Gojo Satoru may help him break the cycle.",
            "Aoi Todo is a character in the Jujutsu Kaisen series and a third-year student at Kyoto Jujutsu High School. He is a grade 1 jujutsu sorcerer with a heavy build, tan skin, and shoulder-length black hair. He is skilled in hand-to-hand combat and has a high level of cursed energy. He can also apply a flash coating of Cursed Energy to his body for defense. Todo's cursed technique, Boogie Woogie, allows him to land deadly blows and surprise his enemies. He is the youngest to achieve the honor of a Grade 1 rank, the highest achievement among sorcerers. He was mentored by the special grade Yuki Tsukumo, and from her, he learned many physical combat skills as well as great tactical intellect. \n" +
                    "Todo is one of the strongest characters in the series. He has showcased his strength and intellect in previous arcs, including defeating five Grade 1 Cursed Spirits and 1 Special Grade during an attack in Kyoto",
            "Yuji Itadori is the main character in the manga series Jujutsu Kaisen and the anime adaptation of the same name. He is a first-year Jujutsu Sorcerer at Tokyo Jujutsu High with superhuman strength, reflexes, and athletic ability. Itadori becomes the vessel for Ryomen Sukuna, the King of the Curses, after eating one of Sukuna's fingers. In return, Sukuna becomes stronger and more dominant within Itadori, giving him more of Sukuna's strength",
            "While still a member of the Zenin clan, Maki wore a traditional outfit, a white yukata, and a black hakama.[4] Maki's original Jujutsu High student uniform consisted of the traditional long sleeve jacket with a skirt. As a first-year student, she wore thick, long tan socks and black shoes with her uniform. As a second-year Maki wore a different pair of glasses and sported black leggings instead of socks.[5][6]\n" +
                    "\n" +
                    "While training for the Goodwill Event, Maki wore a purple tracksuit a black jersey with tan shorts over her leggings.[7] While training Yuta Okkotsu, Maki wore the same top with darker shorts. Her casual clothes consisted of a cyan hoodie over a white shirt with pink horizontal stripes, white shorts over black leggings, and white boots.[8]\n" +
                    "\n",
            "Megumi is a Japanese female name that means \"blessing\" or \"grace\". It is also the name of a fictional character in the manga series Jujutsu Kaisen created by Gege Akutami. Megumi is a dark-haired teenager with a stoic personality who becomes a jujutsu sorcerer after his parents separate. He has many powers, including hand-to-hand combat, weaponry, cursed techniques, and the Ten Shadows Technique, which allows him to summon friendly Cursed Spirits. His allies include divine dogs, toads, elephants, giant serpents, rabbits, and deer",
            "Ryomen Sukuna is a fictional character and main antagonist in the manga and anime series Jujutsu Kaisen. He is a Heian Era sorcerer who was once known as the King of Curses and is considered the greatest sorcerer to ever live. Sukuna is cruel, narcissistic, depraved, and arrogant. He has four arms and two faces, pink spiked hair, tattoos, and lines on his forehead, nose, cheeks, upper body, and abdomen. He is also selfish, cold-hearted, immoral, and sadistic",
            "Yuta Okkotsu is a character in the Jujutsu Kaisen manga series and its prequel Jujutsu Kaisen 0: Jujutsu High. He is a first-year student at Tokyo Jujutsu High with black hair, dark blue eyes, and dark circles under his eyes. He is also a special grade sorcerer with a lot of cursed energy",
            "Master Weapons Specialist: The Sorcerer Killer is capable of employing a wide variety of weapons in battle. His entire fighting style is based around using weapons to substitute for jujutsu. He keeps a vast arsenal in his cursed spirit, allowing him to efficiently switch weapons out based on necessity.\n" +
                    "\n" +
                    "Toji has used non-cursed tools such as swords to perform a sneak attack, so no cursed energy will be detected. Armed with a normal handgun, he's also an expert marksmen with extremely precise aim. The Sorcerer Killer can counter jujutsu users because he is also a master of wielding cursed tools. He's used a cursed tool broadsword to counter and slice open giant cursed spirits.[32][33] Toji has employed knives and daggers, sometimes one in each hand.[34] Additionally he employs his special grade cursed tool: The Inverted Spear of Heaven with a mastery worthy of that ranking. He could capitalize on the dagger's powerful nullification technique to negate even the most powerful sorcerer's abilities.\n" +
                    "\n" +
                    "Toji successfully complements his physical gifts with high adaptability and dexterity with all his weapons. By attaching a chain to the Inverted Spear of Heaven, Toji changed his entire fighting style to suit a long ranged battle.[35] When he first confronted Dagon, Toji took Playful Cloud, a weapon that Megumi stated was difficult to use, from Maki and used it to its maximum potential.[36]\n" +
                    "\n" +
                    "Enhanced Senses: Thanks to his Heavenly Restriction, Toji's lack of cursed energy resulted in his five senses being heightened to their absolute peak. He was able to see curses and jujutsu with just his elevated senses and even developed a resistance to them.[25] This also allowed Toji to track sorcerers without the use of residuals, as he was able to follow human footprints and odors.[37]\n" +
                    "\n" +
                    "Immense Strength: Toji possesses a superhuman degree of physical strength, enough so to effortlessly yank Playful Cloud from Maki's hands, another person with great physical gifts.[38] Using Playful Cloud, a tool that depends on physical strength, Toji was able to easily smash through Dagon's hardest shikigami.[39] With another cursed tool, he was able to cut through Suguru's toughest curse,[40] and used his bare hands to beat Takuma Ino's face so badly he almost died.[27]",

            "Satoru Gojo is a fictional character and sorcerer from Gege Akutami's manga Jujutsu Kaisen. He is a teacher at Tokyo Prefectural Jujutsu High School and is considered one of the most dangerous people alive. He is also known as the strongest Jujutsu Sorcerer in the series. Gojo has many powers and abilities, including:\n" +
                    "Immense cursed energy\n" +
                    "Six Eyes\n" +
                    "Limitless\n" +
                    "Infinity\n" +
                    "Cursed Technique Lapse: Blue\n" +
                    "Cursed Technique Lapse Maximum Cursed Energy Output: Blue\n" +
                    "Cursed Technique Reversal: Red\n" +
                    "Blue Sphere\n" +
                    "Domain Expansion: Unlimited Void",
            "Megumi Fushiguro and Toji Fushiguro are characters in the Jujutsu Kaisen series who have a complicated relationship. Toji is Megumi's father, and Megumi fights Toji outside Shibuya Station on October 31, 2018. Toji is cruel and callous, but he cares about Megumi and wants him to have a better life. However, Toji abandons Megumi, and some say his character arc is tragic because he didn't break the Zenins' cycle of abuse. Megumi may become callous like his father, but the influence of Gojo Satoru may help him break the cycle.",
            "Aoi Todo is a character in the Jujutsu Kaisen series and a third-year student at Kyoto Jujutsu High School. He is a grade 1 jujutsu sorcerer with a heavy build, tan skin, and shoulder-length black hair. He is skilled in hand-to-hand combat and has a high level of cursed energy. He can also apply a flash coating of Cursed Energy to his body for defense. Todo's cursed technique, Boogie Woogie, allows him to land deadly blows and surprise his enemies. He is the youngest to achieve the honor of a Grade 1 rank, the highest achievement among sorcerers. He was mentored by the special grade Yuki Tsukumo, and from her, he learned many physical combat skills as well as great tactical intellect. \n" +
                    "Todo is one of the strongest characters in the series. He has showcased his strength and intellect in previous arcs, including defeating five Grade 1 Cursed Spirits and 1 Special Grade during an attack in Kyoto",
            "Yuji Itadori is the main character in the manga series Jujutsu Kaisen and the anime adaptation of the same name. He is a first-year Jujutsu Sorcerer at Tokyo Jujutsu High with superhuman strength, reflexes, and athletic ability. Itadori becomes the vessel for Ryomen Sukuna, the King of the Curses, after eating one of Sukuna's fingers. In return, Sukuna becomes stronger and more dominant within Itadori, giving him more of Sukuna's strength",
            "While still a member of the Zenin clan, Maki wore a traditional outfit, a white yukata, and a black hakama.[4] Maki's original Jujutsu High student uniform consisted of the traditional long sleeve jacket with a skirt. As a first-year student, she wore thick, long tan socks and black shoes with her uniform. As a second-year Maki wore a different pair of glasses and sported black leggings instead of socks.[5][6]\n" +
                    "\n" +
                    "While training for the Goodwill Event, Maki wore a purple tracksuit a black jersey with tan shorts over her leggings.[7] While training Yuta Okkotsu, Maki wore the same top with darker shorts. Her casual clothes consisted of a cyan hoodie over a white shirt with pink horizontal stripes, white shorts over black leggings, and white boots.[8]\n" +
                    "\n",
            "Megumi is a Japanese female name that means \"blessing\" or \"grace\". It is also the name of a fictional character in the manga series Jujutsu Kaisen created by Gege Akutami. Megumi is a dark-haired teenager with a stoic personality who becomes a jujutsu sorcerer after his parents separate. He has many powers, including hand-to-hand combat, weaponry, cursed techniques, and the Ten Shadows Technique, which allows him to summon friendly Cursed Spirits. His allies include divine dogs, toads, elephants, giant serpents, rabbits, and deer",
            "Ryomen Sukuna is a fictional character and main antagonist in the manga and anime series Jujutsu Kaisen. He is a Heian Era sorcerer who was once known as the King of Curses and is considered the greatest sorcerer to ever live. Sukuna is cruel, narcissistic, depraved, and arrogant. He has four arms and two faces, pink spiked hair, tattoos, and lines on his forehead, nose, cheeks, upper body, and abdomen. He is also selfish, cold-hearted, immoral, and sadistic",
            "Yuta Okkotsu is a character in the Jujutsu Kaisen manga series and its prequel Jujutsu Kaisen 0: Jujutsu High. He is a first-year student at Tokyo Jujutsu High with black hair, dark blue eyes, and dark circles under his eyes. He is also a special grade sorcerer with a lot of cursed energy",
        )
        lateinit var datalist: ArrayList<News>
        datalist= arrayListOf<News>()
        for(index in ImgArray.indices){
            val news=News(ImgArray[index],ParaArray[index], DesciArray[index])
            datalist.add(news)

        }
        myRecycleView=findViewById(R.id.main)
        myRecycleView.layoutManager= LinearLayoutManager(this)

        val myAdapter=MyAdapter(datalist, this)
        myRecycleView.adapter=myAdapter

        myAdapter.setonItemClickListener(object : MyAdapter.onItemClickListener {
            override fun onItemClicking(position: Int){
                val intent=Intent(this@MainActivity,TVview::class.java)
                intent.putExtra("heading",datalist[position].t)
                intent.putExtra("imageId",datalist[position].img)
                intent.putExtra("essay",datalist[position].des)
                startActivity(intent)
            }
        })
    }
}