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

public class vovel extends AppCompatActivity {
    TextView text_view;
    Animation sup,sdow;
    ImageView bv_a,bv_aa,bv_i,bv_ii,bv_u,bv_uu,bv_e,bv_ei,bv_o,bv_ao,bm_a,bm_aa,bm_i,bm_ii,bm_u,bm_uu,bm_e,bm_ei,bm_o,bm_ao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vovel);
        text_view=findViewById(R.id.vovel);
        bv_a=findViewById(R.id.bv_a);
        bv_aa=findViewById(R.id.bv_aa);
        bv_i=findViewById(R.id.bv_i);
        bv_ii=findViewById(R.id.bv_ii);
        bv_u=findViewById(R.id.bv_u);
        bv_uu=findViewById(R.id.bv_uu);
        bv_e=findViewById(R.id.bv_e);
        bv_ei=findViewById(R.id.bv_ae);
        bv_o=findViewById(R.id.bv_o);
        bv_ao=findViewById(R.id.bv_ao);

        bm_a=findViewById(R.id.bm_a);
        bm_aa=findViewById(R.id.bm_aa);
        bm_i=findViewById(R.id.bm_i);
        bm_ii=findViewById(R.id.bm_ii);
        bm_u=findViewById(R.id.bm_u);
        bm_uu=findViewById(R.id.bm_uu);
        bm_e=findViewById(R.id.bm_e);
        bm_ei=findViewById(R.id.bm_ae);
        bm_o=findViewById(R.id.bm_o);
        bm_ao=findViewById(R.id.bm_ao);

        sup = AnimationUtils.loadAnimation(this,R.anim.anim);
        sdow = AnimationUtils.loadAnimation(this,R.anim.anim2);

        text_view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    text_view.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    text_view.startAnimation(sdow);
                }
                return false;

            }

        });

        bv_a.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_a.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_a.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_aa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_aa.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_aa.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_i.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_i.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_i.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_ii.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_ii.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_ii.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_u.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_u.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_u.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_uu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_uu.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_uu.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_e.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_e.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_e.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_ei.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_ei.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_ei.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_o.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_o.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_o.startAnimation(sdow);
                }
                return false;

            }

        });
        bv_ao.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bv_ao.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bv_ao.startAnimation(sdow);
                }
                return false;

            }

        });

        bm_a.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_a.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_a.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_aa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_aa.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_aa.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_i.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_i.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_i.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_ii.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_ii.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_ii.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_u.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_u.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_u.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_uu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_uu.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_uu.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_e.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_e.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_e.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_ei.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_ei.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_ei.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_o.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_o.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_o.startAnimation(sdow);
                }
                return false;

            }

        });
        bm_ao.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    bm_ao.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    bm_ao.startAnimation(sdow);
                }
                return false;

            }

        });

        text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vovel.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}