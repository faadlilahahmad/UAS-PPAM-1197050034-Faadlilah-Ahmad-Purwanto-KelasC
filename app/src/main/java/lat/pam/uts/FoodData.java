package lat.pam.uts;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Integer> getImage() {
        ArrayList<Integer> drawables = new ArrayList<Integer>();
        drawables.add(R.drawable.mie_goreng);
        drawables.add(R.drawable.cireng);
        drawables.add(R.drawable.cappuchino);
        drawables.add(R.drawable.donut);
        drawables.add(R.drawable.sparkling_tea);
        drawables.add(R.drawable.nasigoreng);

        return drawables;
    }
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Kopi Hitam", "Kopi hitam, merupakan hasil ektraksi langsung dari perebusan biji kopi yang disajikan tanpa penambahan perisa apapun. Espreso, merupakan kopi yang dibuat dengan mengekstraksi biji kopi menggunakan uap panas pada tekanan tinggi.", "15000", context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Cappuchino", "Minuman khas Italia yang dibuat dari espreso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki yang tertinggal setelah peperangan yang di pimpin oleh Kara Mustapha Pasha di Wina, Austria melawan tentara gabungan Polandia-Germania.", "17000", context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Black Salad", "Salad buah hitam ala rumahan yang mudah dan enak dari komunitas memasak terbesar dunia! Lihat juga resep Salbu black saus enak lainnya.", "22000", context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Donut", "Cake mini ataupun kue kering dengan bentuk yang khas, yaitu berlubang di tengah seperti cincin dan berbentuk bulat jika diisi sesuatu.", "8500", context.getDrawable(R.drawable.donut)));
        list.add(new Food("Cheesecake", "Kue yang biasanya dimakan sebagai hidangan penutup, dibuat dengan mencampurkan keju yang bertekstur lembut, telur, susu, dan gula.", "20000", context.getDrawable(R.drawable.cheesecake)));
        return list;
    }
}
