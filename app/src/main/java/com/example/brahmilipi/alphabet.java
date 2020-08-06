package com.example.brahmilipi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class alphabet extends AppCompatActivity {

    TextView alphabets;
    Animation sup,sdow;
    ImageView ba_ka,ba_kha,ba_ga,ba_gha,ba_anga,
            ba_ca,ba_cha,ba_ja,ba_jha,ba_ena,
            ba_tta,ba_ttha,ba_dda,ba_ddha,ba_ndda,
            ba_ta,ba_tha,ba_da,ba_dha,ba_na,
            ba_pa,ba_fa,ba_ba,ba_bha,ba_ma,
            ba_ya,ba_ra,ba_la,ba_va,ba_sha,ba_ssha,ba_sa,ba_ha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        alphabets=findViewById(R.id.alphabets);

        ba_ka=findViewById(R.id.ba_ka);
        ba_kha=findViewById(R.id.ba_kha);
        ba_ga=findViewById(R.id.ba_ga);
        ba_gha=findViewById(R.id.ba_gha);
        ba_anga=findViewById(R.id.ba_anga);
        ba_ca=findViewById(R.id.ba_ca);
        ba_cha=findViewById(R.id.ba_cha);
        ba_ja=findViewById(R.id.ba_ja);
        ba_jha=findViewById(R.id.ba_jha);
        ba_ena=findViewById(R.id.ba_ena);

        ba_tta=findViewById(R.id.ba_tta);
        ba_ttha=findViewById(R.id.ba_ttha);
        ba_dda=findViewById(R.id.ba_dda);
        ba_ddha=findViewById(R.id.ba_ddha);
        ba_ndda=findViewById(R.id.ba_ndda);

        ba_ta=findViewById(R.id.ba_ta);
        ba_tha=findViewById(R.id.ba_tha);
        ba_da=findViewById(R.id.ba_da);
        ba_dha=findViewById(R.id.ba_dha);
        ba_na=findViewById(R.id.ba_na);

        ba_pa=findViewById(R.id.ba_pa);
        ba_fa=findViewById(R.id.ba_fa);
        ba_ba=findViewById(R.id.ba_ba);
        ba_bha=findViewById(R.id.ba_bha);
        ba_ma=findViewById(R.id.ba_ma);

        ba_ya=findViewById(R.id.ba_ya);
        ba_ra=findViewById(R.id.ba_ra);
        ba_la=findViewById(R.id.ba_la);
        ba_va=findViewById(R.id.ba_va);
        ba_sha=findViewById(R.id.ba_sha);
        ba_ssha=findViewById(R.id.ba_ssha);
        ba_sa=findViewById(R.id.ba_sa);
        ba_ha=findViewById(R.id.ba_ha);

        sup = AnimationUtils.loadAnimation(this,R.anim.anim);
        sdow = AnimationUtils.loadAnimation(this,R.anim.anim2);

        alphabets.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    alphabets.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    alphabets.startAnimation(sdow);
                }
                return false;

            }

        });


        alphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(alphabet.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ba_ka.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ka.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ka.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_kha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_kha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_kha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ga.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ga.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ga.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_gha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_gha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_gha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_anga.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_anga.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_anga.startAnimation(sdow);
                }
                return false;

            }

        });

        ba_ca.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ca.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ca.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_cha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_cha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_cha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ja.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ja.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ja.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_jha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_jha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_jha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ena.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ena.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ena.startAnimation(sdow);
                }
                return false;

            }

        });

        ba_tta.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_tta.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_tta.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ttha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ttha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ttha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_dda.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_dda.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_dda.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ddha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ddha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ddha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ndda.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ndda.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ndda.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ta.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ta.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ta.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_tha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_tha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_tha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_da.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_da.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_da.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_dha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_dha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_dha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_na.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_na.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_na.startAnimation(sdow);
                }
                return false;

            }

        });

        ba_pa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_pa.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_pa.startAnimation(sdow);
                }
                return false;

            }

        });

        ba_fa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_fa.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_fa.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ba.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ba.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ba.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_bha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_bha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_bha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ma.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ma.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ma.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ya.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ya.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ya.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ra.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ra.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ra.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_la.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_la.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_la.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_va.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_va.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_va.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_sha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_sha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_sha.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ssha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ssha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ssha.startAnimation(sdow);
                }
                return false;

            }

        });

        ba_sa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_sa.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_sa.startAnimation(sdow);
                }
                return false;

            }

        });
        ba_ha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    ba_ha.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    ba_ha.startAnimation(sdow);
                }
                return false;

            }

        });

    }
}