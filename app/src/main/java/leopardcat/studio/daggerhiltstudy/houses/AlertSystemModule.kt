package leopardcat.studio.daggerhiltstudy.houses

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
object AlertSystemModule {

    @Provides
    fun provideAlertSystem(@ApplicationContext context: Context): AlertSystem {
        return NoiseAlertSystem(context)
    }
}