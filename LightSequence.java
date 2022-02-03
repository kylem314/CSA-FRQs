// FRQ 2 Question 2

class LightSequence{

  private String sequence;
  private String oldSeq;
  private String segment;

  public LightSequence(String seq){ 
    sequence = seq;
  }

  public String insertSegment(String segment, int ind){
    sequence = sequence.substring(0, ind) + segment + sequence.substring(ind, sequence.length()); 
    return sequence;
  }

  public String remover(String oldseq, String segment){
    this.oldSeq = oldseq;
    this.segment = segment;
    int start = oldSeq.indexOf(segment);
    String newSeq = oldSeq.substring(0,start) + oldSeq.substring (start+segment.length());
    return newSeq;
  }

  public void distance(double a, double b){
    System.out.println(Math.sqrt(a*a + b*b));
  }

  public void changeSequence(String seq){ 
    sequence = seq;
  }

  public void display(){ 
    System.out.println(sequence);
  }
}