






   public class user{
   private   String nm;
   private int oq;
   private int ds;
   private int cpd;
   private int rt;
   private int ct;
   private int cq;
   private int cov;
   private int rl;
   private int rq;
   
   
   
    /**
     *
     * @param Name
     * @param OpeningQuantity
     * @param DeliverySchedule
     * @param Consumptionperday
     * @param ReceivedToday
     * @param ConsumedToday
     * @param ClosingQuantity
     * @param Coverage
     * @param ReorderingLevel
     * @param ReorderingQuantity
     */
    public user(String Name ,int OpeningQuantity ,int DeliverySchedule ,int Consumptionperday, int ReceivedToday,int ConsumedToday,int ClosingQuantity,int Coverage,int ReorderingLevel,int ReorderingQuantity)
   {this.nm = Name;
    this.oq = OpeningQuantity;
    this.ds = DeliverySchedule;
    this.cpd = Consumptionperday;
    this.rt = ReceivedToday;
    this.ct = ConsumedToday;
    this.cq = ClosingQuantity;
    this.cov = Coverage;
    this.rl= ReorderingLevel;
    this.rq= ReorderingQuantity;
       
   }

    user(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public String getName(){
      return nm; 
   }
    public int getOpeningQuantity(){
      return oq; 
   }
     public int getDeliverySchedule(){
      return ds; 
   }
      public int getConsumptionperday(){
      return cpd; 
   }
     public int getReceivedToday(){
      return rt; 
   } 
      public int getConsumedToday(){
      return ct; 
   } 
       public int getClosingQuantity(){
           cq=oq+rt-ct;
      return cq; 
   } 
        public int getCoverage(){
            cov=cq/cpd;
            
      return cov; 
   } 
         public int getReorderingLevel(){
             rl=ds*2;
             if(cov <= rl){ 
                 
                
            }
      return rl; 
      
      
   } 
          public int getReorderingQuantity(){
              rq=rl*cpd;
      return rq; 
   } 
       
}
  