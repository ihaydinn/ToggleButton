# ToggleButton

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    RelativeLayout rl;
    CheckBox c;
    ToggleButton t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c= (CheckBox) findViewById(R.id.checkBox);
        c.setOnClickListener(this);

        t= (ToggleButton) findViewById(R.id.toggleButton);
        t.setOnCheckedChangeListener(this);

        rl=(RelativeLayout) findViewById(R.id.activity_main);


    }

    @Override
    public void onClick(View view) {
        CheckBox gecici= (CheckBox) view;
        if(gecici.isChecked()){
            Toast.makeText(this, "Seçildi", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Seçim kaldırıldı", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){
            c.setChecked(true);
            rl.setBackgroundColor(Color.BLUE);
        }else{
            c.setChecked(false);
            rl.setBackgroundColor(Color.RED);
        }
    }
}
