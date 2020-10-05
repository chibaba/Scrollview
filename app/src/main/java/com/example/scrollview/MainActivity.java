package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // create a single row that displays both the color image and title with description
    // create a data-source
    // create custom adapter
       ListView first;
       String[] colorName={"abstractYellow", "babyColor", "black","brown","bungurdy",
               "coffeeBrown", "gold", "green", "indigo", "lemon", "lilacred", "maroon", "mosquitoBrown", "pepperred",
             "pink", "purple", "red", "skyBlue", "torquoise", "yeelow"};
       String[]  desc={"II with Red Blue and Yellow is a 1930 painting by Piet Mondrian. A well-known work of art, Mondrian contributes to the abstract visual language in a large",
                        "The page \"Baby color\" does not exist. You can ask for it to be created, but consider checking the search results below to see whether the topic is already covered.",
                         "Black is the darkest color, the result of the absence or complete absorption of visible light. It is an achromatic color",
       "Brown is a composite color. In the CMYK color model used in printing or painting, brown is made by combining red, ",
       " (French: Bourgogne or vin de Bourgogne) is wine made in the Burgundy region in eastern France,[1] in ",
       "Saissetia coffeae, known generally as hemispherical scale,[1] is a species of soft scale insect in the family Coccidae. Other common names include the helmet scale and coffee brown scale.",
       "The web color gold is sometimes referred to as golden to distinguish it from the color metallic gold. The use of gold as a color term in traditional usage is more often applied to the color \"metallic gold\" (shown below). ",
       "Green is the color between blue and yellow on the visible spectrum.",
       "Indigo is a deep and rich color close to the color wheel blue (a primary color in the RGB color space), as well as to some variants of ultramarine, based",
       "Lemon or lemon-color is a pale yellow color, the color of the lemon fruit. The first recorded use of lemon as a color name in English was in 1598. Lemon",
       "Lilac is a color that is a pale violet tone representing the average color of most lilac flowers.",
       "Maroon ( /məˈruːn/ mə-ROON,) is a dark brownish red or dark reddish purple color that takes its name from the French word marron, or chestnut. \"Maron\"",
       " The page \"Mosquitobrown color\" does not exist. You can ask for it to be created.",
       " The page \"Pepper red color\" does not exist. You can ask for it to be created, but consider checking the search results below to see whether the topic is already covered.",
       "Pink is a pale tint of red that is named after a flower of the same name.",
       "numerous variations of the color purple, a sampling of which are shown below. In common English usage, purple is a range of hues of color occurring between red",
       "Red is the color at the end of the visible spectrum of light, next to orange and opposite violet. It has a dominant wavelength of approximately 625–740 nanometres",
       " The page \"Skyblue color\" does not exist. You can ask for it to be created, but consider checking the search results below to see whether the topic is already covered.",
       "Turquoise is an opaque, blue-to-green mineral that is a hydrated phosphate of copper and aluminium, with the chemical formula CuAl6(PO4)4(OH)8·4H2O. ",
       "Yellow is the color between orange and green on the spectrum of visible light."};
       String [] url ={"https://en.wikipedia.org/w/index.php?search=abstract+yellow&", "https://en.wikipedia.org/w/index.php?search=Bay+(color)", "https://en.wikipedia.org/wiki/Black","https://en.wikipedia.org/wiki/Brown",
                 "https://en.wikipedia.org/wiki/Bungurdy","https://en.wikipedia.org/wiki/coffeebrown","https://en.wikipedia.org/wiki/Gold", "https://en.wikipedia.org/wiki/Green","https://en.wikipedia.org/wiki/Indigo",
               "https://en.wikipedia.org/wiki/Lemon", "https://en.wikipedia.org/wiki/lilacred","https://en.wikipedia.org/wiki/Maroon", "https://en.wikipedia.org/wiki/Blackhttps://en.wikipedia.org/wiki/mosquitobrown","https://en.wikipedia.org/wiki/Pepperred",
               "https://en.wikipedia.org/wiki/Pink", "https://en.wikipedia.org/wiki/Purple","https://en.wikipedia.org/wiki/red", "https://en.wikipedia.org/wiki/Skyblue", "https://en.wikipedia.org/wiki/torquoise",
               "https://en.wikipedia.org/wiki/yeelow"};
       Integer[] imgid = {R.drawable.abstractyellow, R.drawable.babycolor, R.drawable.black, R.drawable.brown,
                           R.drawable.bungurdy, R.drawable.coffeebrown, R.drawable.gold, R.drawable.green,
                           R.drawable.indigo, R.drawable.lemon, R.drawable.lilacred, R.drawable.maroon,
                            R.drawable.mosquitobrown, R.drawable.pepperred, R.drawable.pink, R.drawable.purple,
                            R.drawable.red, R.drawable.skyblue, R.drawable.torquoise, R.drawable.yeelow};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (ListView) findViewById(R.id.listview);

        CustomListView customListView = new CustomListView(this, colorName, desc, imgid);

        first.setAdapter(customListView);

        first.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent (getApplicationContext(), ListdataActivity.class);

                intent.putExtra("name", colorName);
                intent.putExtra( "description", desc);
                intent.putExtra("name", imgid);
                startActivity(intent);
            }
        });

    }
}