package JAVA_VOCA;

public enum EnumEx {

        Add(5), Del(10), Search(2), Cancel(101);

        private final int var;
        EnumEx(int v) {
                var = v;
        }

        public int getVar() {
                return var;
        }
}
