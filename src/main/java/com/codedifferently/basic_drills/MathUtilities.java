package com.codedifferently.basic_drills;


public class MathUtilities {

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */

        public Integer add ( int baseValue, int difference){
            int sum = baseValue + difference;
            return sum;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Long add ( long baseValue, long difference){
            long sum = baseValue + difference;
            return sum;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Short add ( short baseValue, short difference){
            short sum = (short) (baseValue + difference);
            return sum;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Byte add ( byte baseValue, byte difference){
            byte sum = (byte) (baseValue + difference);
            return sum;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Float add ( float baseValue, float difference){
            float sum = baseValue + difference;
            return sum;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to add to starting value
         * @return sum of `baseValue` and `difference`
         */
        public Double add ( double baseValue, double difference){
            Double sum = baseValue + difference;
            return sum;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Integer subtract ( int baseValue, int difference){
            Integer diff = baseValue - difference;
            return diff;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Long subtract ( long baseValue, long difference){
            Long diff = baseValue - difference;
            return diff;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Short subtract ( short baseValue, short difference){
            int diff = baseValue - difference;
            short convToShort = (short) diff;
            return convToShort;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Byte subtract ( byte baseValue, byte difference){
            int diff = baseValue - difference;
            String sizeStr = Integer.toString(diff);
            byte convToByte = Byte.valueOf(sizeStr);
            return convToByte;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Float subtract ( float baseValue, float difference){
            float diff = baseValue - difference;
            return diff;
        }

        /**
         * @param baseValue  starting value
         * @param difference value to subtract from starting value
         * @return difference between `baseValue` and `difference`
         */
        public Double subtract ( double baseValue, double difference){
            double diff = baseValue - difference;
            return diff;
        }


        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Integer divide ( int dividend, int divisor){
            Integer div = dividend / divisor;
            return div;
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Long divide ( long dividend, long divisor){
            long div = dividend / divisor;
            return div;
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        //public Short divide ( short dividend, short divisor){
        //  short div = dividend / divisor;
        //    return div;
        //}

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        //public Byte divide ( byte dividend, byte divisor){
        //    byte div = dividend / divisor;
        //    return div;
        //}

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Float divide ( float dividend, float divisor){
            float div = dividend / divisor;
            return div;
        }

        /**
         * @param dividend value to be divided
         * @param divisor value to divide by
         * @return division of `dividend` by `divisor
         */
        public Double divide ( double dividend, double divisor){
            double div = dividend / divisor;
            return div;
        }


        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Integer multiply ( int multiplicand, int multiplier){
            Integer product = multiplicand * multiplier;
            return product;
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Long multiply ( long multiplicand, long multiplier){
            long product = multiplicand * multiplier;
            return product;
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        //public Short multiply ( short multiplicand, short multiplier){
        //    int product = multiplicand * multiplier;
        //    return product;
        //}
        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        //public Byte multiply ( byte multiplicand, byte multiplier){
        //    byte product = multiplicand * multiplier;
        //    return product;
        //}

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Float multiply ( float multiplicand, float multiplier){
            float product = multiplicand * multiplier;
            return product;
        }

        /**
         * @param multiplicand value to be multiplied
         * @param multiplier value to multiply by
         * @return product of `multiplicand` by `multiplier`
         */
        public Double multiply ( double multiplicand, double multiplier){
            double product = multiplicand * multiplier;
            return product;
        }

}


