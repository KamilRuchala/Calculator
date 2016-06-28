package com.example.kamil.calculator;

import android.widget.Button;

/**
 * Created by Kamil on 27.06.2016.
 */

public class UIElements
{
    public static class MainElements
    {
        private MainActivity _mActivity;
        private Button _zero;
        private Button _one;
        private Button _two;
        private Button _three;
        private Button _four;
        private Button _five;
        private Button _six;
        private Button _seven;
        private Button _eight;
        private Button _nine;
        private Button _comma;
        private Button _multiply;
        private Button _divide;
        private Button _add;
        private Button _sub;
        private Button _result;
        private Button _modulo;
        private Button _backspace;
        private Button _clear;
        private Button _power;

        public MainElements(MainActivity mainAct)
        {
            _mActivity = mainAct;
        }

        public Button get_zero() {
            if(_zero == null)
            {
                _zero = (Button) _mActivity.findViewById(R.id.button0);
            }
            return _zero;
        }

        public Button get_one() {
            if(_one == null)
            {
                _one = (Button) _mActivity.findViewById(R.id.button1);
            }
            return _one;
        }

        public Button get_two() {
            if(_two == null)
            {
                _two = (Button) _mActivity.findViewById(R.id.button2);
            }
            return _two;
        }

        public Button get_three() {
            if(_three == null)
            {
                _three = (Button) _mActivity.findViewById(R.id.button3);
            }
            return _three;
        }

        public Button get_four() {
            if(_four == null)
            {
                _four = (Button) _mActivity.findViewById(R.id.button4);
            }
            return _four;
        }

        public Button get_five() {
            if(_five == null)
            {
                _five = (Button) _mActivity.findViewById(R.id.button5);
            }
            return _five;
        }

        public Button get_six() {
            if(_six == null)
            {
                _six = (Button) _mActivity.findViewById(R.id.button6);
            }
            return _six;
        }

        public Button get_seven() {
            if(_seven == null)
            {
                _seven = (Button) _mActivity.findViewById(R.id.button7);
            }
            return _seven;
        }

        public Button get_eight() {
            if(_eight == null)
            {
                _eight = (Button) _mActivity.findViewById(R.id.button8);
            }
            return _eight;
        }

        public Button get_nine() {
            if(_nine == null)
            {
                _nine = (Button) _mActivity.findViewById(R.id.button9);
            }
            return _nine;
        }

        public Button get_comma() {
            if(_comma == null)
            {
                _comma = (Button) _mActivity.findViewById(R.id.comma_button);
            }
            return _comma;
        }

        public Button get_multiply() {
            if(_multiply == null)
            {
                _multiply = (Button) _mActivity.findViewById(R.id.multiple_button);
            }
            return _multiply;
        }

        public Button get_divide() {
            if(_divide == null)
            {
                _divide = (Button) _mActivity.findViewById(R.id.div_button);
            }
            return _divide;
        }

        public Button get_add() {
            if(_add == null)
            {
                _add = (Button) _mActivity.findViewById(R.id.add_button);
            }
            return _add;
        }

        public Button get_sub() {
            if(_sub == null)
            {
                _sub = (Button) _mActivity.findViewById(R.id.sub_button);
            }
            return _sub;
        }

        public Button get_result() {
            if(_result == null)
            {
                _result = (Button) _mActivity.findViewById(R.id.result_button);
            }
            return _result;
        }

        public Button get_modulo() {
            if(_modulo == null)
            {
                _modulo = (Button) _mActivity.findViewById(R.id.mod_button);
            }
            return _modulo;
        }

        public Button get_backspace() {
            if(_backspace == null)
            {
                _backspace = (Button) _mActivity.findViewById(R.id.backspace_button);
            }
            return _backspace;
        }

        public Button get_clear() {
            if(_clear == null)
            {
                _clear = (Button) _mActivity.findViewById(R.id.clear_button);
            }
            return _clear;
        }

        public Button get_power() {
            if(_power == null)
            {
                _power = (Button) _mActivity.findViewById(R.id.power_button);
            }
            return _power;
        }


    }
}
