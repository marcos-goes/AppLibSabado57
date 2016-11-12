package br.com.caelum.libcurso57sabado;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img_pokemon)
    ImageView poke;

    @BindView(R.id.img_digimon)
    ImageView dig;
    @BindView(R.id.img_abacaxi)
    ImageView abacaxi;
    @BindView(R.id.img_melancia)
    ImageView melancia;

    @BindView(R.id.entrada_texto)
    EditText telefone;
    @BindView(R.id.saida_texto)
    TextView saida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        Picasso picasso = Picasso.with(this);

        picasso.load("http://sm.ign.com/ign_pt/news/n/new-digimo/new-digimon-adventure-tri-poster-original-cast-ret_wksn.jpg")
                .into(dig);

        picasso.load("http://maegeek.r7.com/wp-content/uploads/2016/07/feautured.jpg")
                .into(poke);

        picasso.load("http://akphoto1.ask.fm/533/134/492/1280003018-1pp4k6l-762jf49orda41fp/original/Screenshot20120509at11818AM.png").into(melancia);

        picasso.load("http://vignette1.wikia.nocookie.net/sponge-bob/images/7/7a/Casa.jpg/revision/latest?cb=20140402002535&path-prefix=pt-br")
                .into(abacaxi);

    }

    @OnClick(R.id.btn_dig)
    public void clickBtnDigimon(){
        dig.setVisibility(View.VISIBLE);

    }

    @OnClick(R.id.btn_pok)
    public void clickBtnPokemon(){
        poke.setVisibility(View.VISIBLE);
    }
    @OnClick(R.id.btn_abacaxi)
    public void clickBtnAbacaxi(){

        if (abacaxi.getVisibility()!= View.VISIBLE) {
            abacaxi.setVisibility(View.VISIBLE);
        } else {
            abacaxi.setVisibility(View.GONE);
        }
    }

    @OnClick(R.id.btn_marcelinho)
    public void clickBtnSeiLaMano(){
        melancia.setVisibility(View.VISIBLE);
    }



    @OnTextChanged(R.id.entrada_texto)
    public void mudouTexto(CharSequence nome){
        saida.setText("");
        saida.setText(nome);
    }
}
