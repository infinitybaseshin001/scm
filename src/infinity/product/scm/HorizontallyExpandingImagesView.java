package infinity.product.scm;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Matrix;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
 
public class HorizontallyExpandingImagesView extends LinearLayout
{
	private ArrayList<ImageView> mImageViewList = new ArrayList<ImageView>();
 
    
    public HorizontallyExpandingImagesView(Context context)
    {
        super(context);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        setOrientation(LinearLayout.VERTICAL);
        
    }
 
    
    public void addImageView(ImageView iv)
    {
        mImageViewList.add(iv);
        
    }
 
    
    public void removeImageView(ImageView iv)
    {
        boolean bRemoved = false;
        
        do
        {
            bRemoved = mImageViewList.remove(iv);
            
        } while (bRemoved);
        
    }
 
    
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh)
    {
        super.onSizeChanged(w, h, oldw, oldh);
 
        int iw = 0;
        int ih = 0;
        float factor = 0.0f;
 
        for (ImageView imageView : mImageViewList)
        {
            iw = imageView.getDrawable().getIntrinsicWidth();
            ih = imageView.getDrawable().getIntrinsicHeight();
            factor = (float) w / iw;
            Matrix m = imageView.getImageMatrix();
            m.reset();
            m.postScale(factor, factor);
            imageView.getLayoutParams().width = w;
            imageView.getLayoutParams().height = (int) (ih * factor);
 
            imageView.invalidate();
            
        }
        
    }
    
}