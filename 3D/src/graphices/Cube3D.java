 /*
  *   *       Please Visit us at www.codemiles.com     *
  *  This Program was Developed by www.codemiles.com forums Team
  *  *           Please Don't Remove This Comment       *
  */

package graphices;

import java.awt.Color;
import java. util.ArrayList;

/**
 *
 * @author mohamed
 */
public class Cube3D {
    
    /** Creates a new instance of Cube3D */
    public Cube3D() {
        create_cube();
    }
    
    public void create_cube() {
        
        temp=new Polygon3D(new Vector3D[]{
            new Vector3D(5,70,5),
            new Vector3D(5,70,0),
            new Vector3D(0,70,0),
            new Vector3D(0,70,5)
        });
        Polygons.add(temp);//add the Polygon to the cub
        
        temp=new Polygon3D(new Vector3D[]{
            new Vector3D(5,0,5),
            new Vector3D(0,0,5),
            new Vector3D(0,0,0),
            new Vector3D(5,0,0),
        });
        Polygons.add(temp);//add the Polygon to the cub
        
        temp=new Polygon3D(new Vector3D[]{
            new Vector3D(0,70,0),
            new Vector3D(0,70,5),
            new Vector3D(0,0,5),
            new Vector3D(0,0,0),
        });
        Polygons.add(temp);//add the Polygon to the cub
        
        temp=new Polygon3D(new Vector3D[]{
            new Vector3D(5,0,0),
            new Vector3D(5,0,5),
            new Vector3D(5,70,5),
            new Vector3D(5,70,0),
        });
        Polygons.add(temp);//add the Polygon to the cub
        
        //bentuk 2 (belakang)
        temp=new Polygon3D(new Vector3D[]{
            new Vector3D(0,0,-50),
            new Vector3D(0,0,-45),
            new Vector3D(5,0,-45),
            new Vector3D(5,0,-50)
        });
        Polygons.add(temp);//add the Polygon to the cub
        
        
        temp=new Polygon3D(new Vector3D[]{
                new Vector3D(0,70,-50),
                new Vector3D(0,70,-45),
                new Vector3D(5,70,-45),
                new Vector3D(5,70,-50),
            });
            Polygons.add(temp);//add the Polygon to the cub
            
            temp=new Polygon3D(new Vector3D[]{
                new Vector3D(0,0,-50),
                new Vector3D(0,0,-45),
                new Vector3D(0,70,-45),
                new Vector3D(0,70,-50),
            });
            Polygons.add(temp);//add the Polygon to the cub
            
            temp=new Polygon3D(new Vector3D[]{
                new Vector3D(5,0,-45),
                new Vector3D(5,70,-45),
                new Vector3D(5,70,-50),
                new Vector3D(5,0,-50),
            });
            Polygons.add(temp);//add the Polygon to the cub
            
            //bentuk kaki kanan(copy)
            temp=new Polygon3D(new Vector3D[]{
                    new Vector3D(125,70,5),
                    new Vector3D(125,70,0),
                    new Vector3D(120,70,0),
                    new Vector3D(120,70,5)
                });
                Polygons.add(temp);//add the Polygon to the cub
                
                temp=new Polygon3D(new Vector3D[]{
                    new Vector3D(125,0,5),
                    new Vector3D(120,0,5),
                    new Vector3D(120,0,0),
                    new Vector3D(125,0,0),
                });
                Polygons.add(temp);//add the Polygon to the cub
                
                temp=new Polygon3D(new Vector3D[]{
                    new Vector3D(120,70,0),
                    new Vector3D(120,70,5),
                    new Vector3D(120,0,5),
                    new Vector3D(120,0,0),
                });
                Polygons.add(temp);//add the Polygon to the cub
                
                temp=new Polygon3D(new Vector3D[]{
                    new Vector3D(125,0,0),
                    new Vector3D(125,0,5),
                    new Vector3D(125,70,5),
                    new Vector3D(125,70,0),
                });
                Polygons.add(temp);//add the Polygon to the cub
                
                //bentuk 2 (belakang)
                temp=new Polygon3D(new Vector3D[]{
                    new Vector3D(120,0,-50),
                    new Vector3D(120,0,-45),
                    new Vector3D(125,0,-45),
                    new Vector3D(125,0,-50)
                });
                Polygons.add(temp);//add the Polygon to the cub
                
                
                temp=new Polygon3D(new Vector3D[]{
                        new Vector3D(120,70,-50),
                        new Vector3D(120,70,-45),
                        new Vector3D(125,70,-45),
                        new Vector3D(125,70,-50),
                    });
                    Polygons.add(temp);//add the Polygon to the cub
                    
                    temp=new Polygon3D(new Vector3D[]{
                        new Vector3D(120,0,-50),
                        new Vector3D(120,0,-45),
                        new Vector3D(120,70,-45),
                        new Vector3D(120,70,-50),
                    });
                    Polygons.add(temp);//add the Polygon to the cub
                    
                    temp=new Polygon3D(new Vector3D[]{
                        new Vector3D(125,0,-45),
                        new Vector3D(125,70,-45),
                        new Vector3D(125,70,-50),
                        new Vector3D(125,0,-50),
                    });
                    Polygons.add(temp);//add the Polygon to the cub
                    
                    //bentuk alas atas
                    temp=new Polygon3D(new Vector3D[]{
                            new Vector3D(5,65,5),
                            new Vector3D(5,65,0),
                            new Vector3D(0,65,0),
                            new Vector3D(0,65,5)
                        });
                        Polygons.add(temp);//add the Polygon to the cub
                        
                        temp=new Polygon3D(new Vector3D[]{
                            new Vector3D(5,63,5),
                            new Vector3D(5,63,0),
                            new Vector3D(0,63,0),
                            new Vector3D(0,63,5),
                        });
                        Polygons.add(temp);//add the Polygon to the cub
                        
                        temp=new Polygon3D(new Vector3D[]{
                                new Vector3D(125,65,5),
                                new Vector3D(125,65,0),
                                new Vector3D(0,65,0),
                                new Vector3D(0,65,5)
                            });
                            Polygons.add(temp);//add the Polygon to the cub
                            
                            temp=new Polygon3D(new Vector3D[]{
                                new Vector3D(125,63,5),
                                new Vector3D(125,63,0),
                                new Vector3D(0,63,0),
                                new Vector3D(0,63,5),
                            });
                            Polygons.add(temp);//add the Polygon to the cub
                            
                            temp=new Polygon3D(new Vector3D[]{
                                    new Vector3D(5,65,-45),
                                    new Vector3D(5,65,-50),
                                    new Vector3D(0,65,-50),
                                    new Vector3D(0,65,-45)
                                });
                                Polygons.add(temp);//add the Polygon to the cub
                                
                                temp=new Polygon3D(new Vector3D[]{
                                    new Vector3D(5,63,-45),
                                    new Vector3D(5,63,-50),
                                    new Vector3D(0,63,-50),
                                    new Vector3D(0,63,-45),
                                });
                                Polygons.add(temp);//add the Polygon to the cub
                                
                                temp=new Polygon3D(new Vector3D[]{
                                        new Vector3D(125,65,-45),
                                        new Vector3D(125,65,-50),
                                        new Vector3D(0,65,-50),
                                        new Vector3D(0,65,-45)
                                    });
                                    Polygons.add(temp);//add the Polygon to the cub
                                    
                                    temp=new Polygon3D(new Vector3D[]{
                                        new Vector3D(125,63,-45),
                                        new Vector3D(125,63,-50),
                                        new Vector3D(0,63,-50),
                                        new Vector3D(0,63,-45),
                                    });
                                    Polygons.add(temp);//add the Polygon to the cub
            
                                    temp=new Polygon3D(new Vector3D[]{
                                            new Vector3D(5,65,0),
                                            new Vector3D(0,65,0),
                                            new Vector3D(0,65,-45),
                                            new Vector3D(5,65,-45)
                                        });
                                        Polygons.add(temp);//add the Polygon to the cub
                                        
                                        temp=new Polygon3D(new Vector3D[]{
                                                new Vector3D(5,63,0),
                                                new Vector3D(0,63,0),
                                                new Vector3D(0,63,-45),
                                                new Vector3D(5,63,-45)
                                            });
                                            Polygons.add(temp);//add the Polygon to the cub
                                            
                                            temp=new Polygon3D(new Vector3D[]{
                                                    new Vector3D(125,65,0),
                                                    new Vector3D(120,65,0),
                                                    new Vector3D(120,65,-45),
                                                    new Vector3D(125,65,-45)
                                                });
                                                Polygons.add(temp);//add the Polygon to the cub
                                                
                                                temp=new Polygon3D(new Vector3D[]{
                                                        new Vector3D(125,63,0),
                                                        new Vector3D(120,63,0),
                                                        new Vector3D(120,63,-45),
                                                        new Vector3D(125,63,-45)
                                                    });
                                                    Polygons.add(temp);//add the Polygon to the cub
            //bentuk alas bawah
                                                    temp=new Polygon3D(new Vector3D[]{
                                                            new Vector3D(5,35,5),
                                                            new Vector3D(5,35,0),
                                                            new Vector3D(0,35,0),
                                                            new Vector3D(0,35,5)
                                                        });
                                                        Polygons.add(temp);//add the Polygon to the cub
                                                        
                                                        temp=new Polygon3D(new Vector3D[]{
                                                            new Vector3D(5,33,5),
                                                            new Vector3D(5,33,0),
                                                            new Vector3D(0,33,0),
                                                            new Vector3D(0,33,5),
                                                        });
                                                        Polygons.add(temp);//add the Polygon to the cub
                                                        
                                                        temp=new Polygon3D(new Vector3D[]{
                                                                new Vector3D(125,35,5),
                                                                new Vector3D(125,35,0),
                                                                new Vector3D(0,35,0),
                                                                new Vector3D(0,35,5)
                                                            });
                                                            Polygons.add(temp);//add the Polygon to the cub
                                                            
                                                            temp=new Polygon3D(new Vector3D[]{
                                                                new Vector3D(125,33,5),
                                                                new Vector3D(125,33,0),
                                                                new Vector3D(0,33,0),
                                                                new Vector3D(0,33,5),
                                                            });
                                                            Polygons.add(temp);//add the Polygon to the cub
                                                            
                                                            temp=new Polygon3D(new Vector3D[]{
                                                                    new Vector3D(5,35,-45),
                                                                    new Vector3D(5,35,-50),
                                                                    new Vector3D(0,35,-50),
                                                                    new Vector3D(0,35,-45)
                                                                });
                                                                Polygons.add(temp);//add the Polygon to the cub
                                                                
                                                                temp=new Polygon3D(new Vector3D[]{
                                                                    new Vector3D(5,33,-45),
                                                                    new Vector3D(5,33,-50),
                                                                    new Vector3D(0,33,-50),
                                                                    new Vector3D(0,33,-45),
                                                                });
                                                                Polygons.add(temp);//add the Polygon to the cub
                                                                
                                                                temp=new Polygon3D(new Vector3D[]{
                                                                        new Vector3D(125,35,-45),
                                                                        new Vector3D(125,35,-50),
                                                                        new Vector3D(0,35,-50),
                                                                        new Vector3D(0,35,-45)
                                                                    });
                                                                    Polygons.add(temp);//add the Polygon to the cub
                                                                    
                                                                    temp=new Polygon3D(new Vector3D[]{
                                                                        new Vector3D(125,33,-45),
                                                                        new Vector3D(125,33,-50),
                                                                        new Vector3D(0,33,-50),
                                                                        new Vector3D(0,33,-45),
                                                                    });
                                                                    Polygons.add(temp);//add the Polygon to the cub
                                            
                                                                    temp=new Polygon3D(new Vector3D[]{
                                                                            new Vector3D(5,35,0),
                                                                            new Vector3D(0,35,0),
                                                                            new Vector3D(0,35,-45),
                                                                            new Vector3D(5,35,-45)
                                                                        });
                                                                        Polygons.add(temp);//add the Polygon to the cub
                                                                        
                                                                        temp=new Polygon3D(new Vector3D[]{
                                                                                new Vector3D(5,33,0),
                                                                                new Vector3D(0,33,0),
                                                                                new Vector3D(0,33,-45),
                                                                                new Vector3D(5,33,-45)
                                                                            });
                                                                            Polygons.add(temp);//add the Polygon to the cub
                                                                            
                                                                            temp=new Polygon3D(new Vector3D[]{
                                                                                    new Vector3D(125,35,0),
                                                                                    new Vector3D(120,35,0),
                                                                                    new Vector3D(120,35,-45),
                                                                                    new Vector3D(125,35,-45)
                                                                                });
                                                                                Polygons.add(temp);//add the Polygon to the cub
                                                                                
                                                                                temp=new Polygon3D(new Vector3D[]{
                                                                                        new Vector3D(125,33,0),
                                                                                        new Vector3D(120,33,0),
                                                                                        new Vector3D(120,33,-45),
                                                                                        new Vector3D(125,33,-45)
                                                                                    });
                                                                                    Polygons.add(temp);//add the Polygon to the cub
                                                                                   
             //gambar TV
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(10,75,-10),
            		 new Vector3D(115,75,-10),
            		 new Vector3D(115,135,-10),
            		 new Vector3D(10,135,-10),
             });
             Polygons.add(temp);//add the Polygon to the cub
             
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(10,75,-15),
            		 new Vector3D(115,75,-15),
            		 new Vector3D(115,135,-15),
            		 new Vector3D(10,135,-15),
             });
             Polygons.add(temp);//add the Polygon to the cub
             
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(10,75,-10),
            		 new Vector3D(10,75,-15),
            		 new Vector3D(10,135,-15),
            		 new Vector3D(10,135,-10),
             });
             Polygons.add(temp);//add the Polygon to the cub
             
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(115,75,-10),
            		 new Vector3D(115,75,-15),
            		 new Vector3D(115,135,-15),
            		 new Vector3D(115,135,-10),
             });
             Polygons.add(temp);//add the Polygon to the cub
             
             //cagak
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(55,65,-6),
            		 new Vector3D(75,65,-6),
            		 new Vector3D(75,65,-19),
            		 new Vector3D(55,65,-19),
             });
             Polygons.add(temp);//add the Polygon to the cub
             
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(70,65,-12),
            		 new Vector3D(70,65,-13),
            		 new Vector3D(60,65,-13),
            		 new Vector3D(60,65,-12),
             });
             Polygons.add(temp);//add the Polygon to the cub
             
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(70,75,-12),
            		 new Vector3D(70,75,-13),
            		 new Vector3D(60,75,-13),
            		 new Vector3D(60,75,-12),
             });
             Polygons.add(temp);//add the Polygon to the cub
             
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(70,75,-12),
            		 new Vector3D(70,65,-12),
            		 new Vector3D(70,65,-13),
            		 new Vector3D(70,75,-13),
             });
             Polygons.add(temp);//add the Polygon to the cub
             
             temp=new Polygon3D(new Vector3D[]{
            		 new Vector3D(60,75,-12),
            		 new Vector3D(60,65,-12),
            		 new Vector3D(60,65,-13),
            		 new Vector3D(60,75,-13),
             });
             Polygons.add(temp);//add the Polygon to the cub
    }
    
    public ArrayList getPolygons() {
        return Polygons;
    }
    
    private ArrayList Polygons=new ArrayList();
    private Polygon3D temp;
    
}
 /*
  *   *       Please Visit us at www.codemiles.com     *
  *  This Program was Developed by www.codemiles.com forums Team
  *  *           Please Don't Remove This Comment       *
  */