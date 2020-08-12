package builder.higher;

/**
 * 奶茶
 */
public class MilkTea {
    private String joice;
    private String bubble;
    private String tea;
    private String sugar;
    private String ice;

    @Override
    public String toString() {
        return "MilkTea{" +
                "joice='" + joice + '\'' +
                ", bubble='" + bubble + '\'' +
                ", tea='" + tea + '\'' +
                ", sugar='" + sugar + '\'' +
                ", ice='" + ice + '\'' +
                '}';
    }

    private MilkTea(Builder builder) {
        this.joice = builder.joice;
        this.bubble = builder.bubble;
        this.tea = builder.tea;
        this.sugar = builder.sugar;
        this.ice = builder.ice;
    }

    public static class Builder {
        private String joice;
        private String bubble;
        private String tea;
        private String sugar;
        private String ice;

        public Builder joice(String joice) {
            this.joice = joice;
            return this;
        }

        public Builder bubble(String bubble) {
            this.bubble = bubble;
            return this;
        }

        public Builder tea(String tea) {
            this.tea = tea;
            return this;
        }

        public Builder sugar(String sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder ice(String ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }
    }
}
